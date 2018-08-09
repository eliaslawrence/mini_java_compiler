/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntax;

/**
 *
 * @author Elias e Carlos Bruno
 */

//Tokens utilizados na analise sintatica
public enum Token {
     //Operadores ou Pontuacoes
     MAIS, MENOS, VEZES, DIVISAO, E, NAO, IGUAL_LOGICO, DIFERENTE, IGUAL,  
     EXCLAMACAO_CONTRARIO, ABRE_PARENTESES, FECHA_PARENTESES, ABRE_COLCHETES, 
     FECHA_COLCHETES, ABRE_CHAVES, FECHA_CHAVES, PONTO_E_VIRGULA, VIRGULA, PONTO, MENOR, 
     
     //Palavras reservadas
     PUBLIC , CLASS , EXTENDS , NEW , STATIC , TRUE , ELSE , IF , RETURN , WHILE, 
     PRINT , BOOLEAN , INT , THIS , VOID , MAIN , LENGTH , FALSE, NULL , STRING,
     
     //Outros
     COMENTARIO, ID, NUMERAL, QUEBRA_LINHA, ERROR,
}
