/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import lexical.Token;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import syntax.SyntaxAnalyzer;

/**
 *
 * @author Elias e Carlos Bruno
 */
public class LexicalAnalyzer {    
    
    //Analisador Lexico
    public static void lexicalError(String code) {
        try {
            String expr;
            expr = code;
            Lexer lexer = new Lexer(new StringReader(expr));

            String resultado = "";
            
            //Contador da linha em que ocorreu o erro lexico
            int numLine = 1;
            //Flag que eh setada qnd encontra erro
            boolean error = false;
            
            loop:
            while (true) {
                Token token;

                token = lexer.yylex();

                if (token == null) {
                    break;
                }

                switch (token) {                    
                    case ERROR:  
                        //Encontrou erro: seta a flag e coloca na msg o erro encontrado
                        error = true;
                        SyntaxAnalyzer.message = "Error in line " + numLine + " : Lexical error with token \'" + lexer.lexeme + "\'\n";
                        break loop;                    
                    case QUEBRA_LINHA:
                        //A cada quebra de linha incrementa o contador de numero de linhas
                        numLine++;
                    default:
                }
            }
            if(error){
                SyntaxAnalyzer.errorLine = numLine;
            }
        } catch (IOException ex) {
            Logger.getLogger(LexicalAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
