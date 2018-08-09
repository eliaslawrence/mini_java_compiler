package analisadorlexico;


import static analisadorlexico.Token.*;
%%
%class Lexer
%type Token

L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r\n\f]
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"

// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?

DocumentationComment = "/**" {CommentContent} "*"+ "/"

CommentContent       = ( [^*] | \*+ [^/*] )*        
    

%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}

/* Operadores e Pontuações */

( "+" | "-" | "*" | "/" | "&&" | "!" | "==" | "!=" | "=" | "¡" | "(" | ")" | "{" | "}" | "[" | "]" | ";" | "," |  "." )    {lexeme = yytext(); return OPERADOR_OU_PONTUACAO;}

/* Caracteres Especiais */
/*(\b | "\t" | "\n" | "\f" | "\r")   {lexeme = yytext(); return ESPACO_EM_BRANCO;} */

/* Comentarios */
{TraditionalComment} | {EndOfLineComment} | {DocumentationComment}  {lexeme = yytext(); return COMENTARIO;}

/* Quebra de Linha */
{LineTerminator}  {lexeme = yytext(); return QUEBRA_LINHA;}

/* 20 palavras reservadas de MiniJava */
(public | class | extends | new | static | true | else | if | return | while 
 | System.out.println | boolean | int | this | void | main | length | false
 | null | String ) {lexeme = yytext(); return PALAVRA_RESERVADA;}


{L}({L}|{D})* {lexeme=yytext(); return ID;}
("-"{D}+)|{D}+ {lexeme=yytext(); return NUMERAL;}




. {lexeme=yytext(); return ERROR;}
