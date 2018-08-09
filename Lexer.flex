package sintatico;

import sintatico.sym;
import java_cup.runtime.*;
//import static analisadorlexico.Token.*;
%%
%cup
%full
%line
%char
%ignorecase
%eofval{
    return new Symbol(sym.EOF, new String("Fim do Arquivo"));
%eofval}

//%class Lexer
//%type Token
//public String lexeme;
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

("+") { return new Symbol (sym.PLUS, yychar, yyline, yytext());}
("-") { return new Symbol (sym.MINUS, yychar, yyline, yytext());}
("*") { return new Symbol (sym.TIMES, yychar, yyline, yytext());}
("/") { return new Symbol (sym.BAR, yychar, yyline, yytext());}
("&&") { return new Symbol (sym.AND, yychar, yyline, yytext());}
("!") { return new Symbol (sym.NOT, yychar, yyline, yytext());}
("==") { return new Symbol (sym.EQUALS, yychar, yyline, yytext());}
("!=") { return new Symbol (sym.NOT_EQUALS, yychar, yyline, yytext());}
("=") { return new Symbol (sym.BECOMES, yychar, yyline, yytext());}
//("¡") { return new Symbol (sym.EXCLAMACAO_CONTRARIO, yychar, yyline, yytext());}
("(") { return new Symbol (sym.LPAREN, yychar, yyline, yytext());}
(")") { return new Symbol (sym.RPAREN, yychar, yyline, yytext());}
("{") { return new Symbol (sym.LBRACE, yychar, yyline, yytext());}
("}") { return new Symbol (sym.RBRACE, yychar, yyline, yytext());}
("[") { return new Symbol (sym.LBRACKET, yychar, yyline, yytext());}
("]") { return new Symbol (sym.RBRACKET, yychar, yyline, yytext());}
(";") { return new Symbol (sym.SEMICOLON, yychar, yyline, yytext());}
(",") { return new Symbol (sym.COMMA, yychar, yyline, yytext());}
( ".") { return new Symbol (sym.DOT, yychar, yyline, yytext());}
("<") { return new Symbol (sym.LT, yychar, yyline, yytext());}

/* Caracteres Especiais */
/*(\b | "\t" | "\n" | "\f" | "\r")   {/* Ignore */} */

/* Comentarios */
{TraditionalComment} | {EndOfLineComment} | {DocumentationComment}  {/* Ignore */}

/* Quebra de Linha */
{LineTerminator}  {/* Ignore */}

/* 20 palavras reservadas de MiniJava */
("public") {return new Symbol (sym.PUBLIC, yychar, yyline, yytext());}
("class") {return new Symbol (sym.CLASS, yychar, yyline, yytext());}
("extends") {return new Symbol (sym.EXTENDS, yychar, yyline, yytext());}
("new") {return new Symbol (sym.NEW, yychar, yyline, yytext());}
("static") {return new Symbol (sym.STATIC, yychar, yyline, yytext());}
("true") {return new Symbol (sym.TRUE, yychar, yyline, yytext());}
("else") {return new Symbol (sym.ELSE, yychar, yyline, yytext());}
("if") {return new Symbol (sym.IF, yychar, yyline, yytext());}
("return") {return new Symbol (sym.RETURN, yychar, yyline, yytext());}
("while") {return new Symbol (sym.WHILE, yychar, yyline, yytext());}
("System.out.println") {return new Symbol (sym.SYSTEM_OUT_PRINTLN, yychar, yyline, yytext());}
("boolean") {return new Symbol (sym.BOOLEAN_TYPE, yychar, yyline, yytext());}
("int") {return new Symbol (sym.INTEGER_TYPE, yychar, yyline, yytext());}
("this") {return new Symbol (sym.THIS, yychar, yyline, yytext());}
("void") {return new Symbol (sym.VOID, yychar, yyline, yytext());}
("main") {return new Symbol (sym.MAIN, yychar, yyline, yytext());}
("length") {return new Symbol (sym.LENGTH, yychar, yyline, yytext());}
("false") {return new Symbol (sym.FALSE, yychar, yyline, yytext());}
("null") {return new Symbol (sym.NULL, yychar, yyline, yytext());}
("String") {return new Symbol (sym.STRING, yychar, yyline, yytext());}


{L}({L}|{D})* {return new Symbol (sym.IDENTIFIER, yychar, yyline, yytext());}
("-"{D}+)|{D}+ {return new Symbol (sym.INTEGER_LITERAL, yychar, yyline, yytext());}




. {System.err.println("Caractere Ilegal: " +yytext());}
