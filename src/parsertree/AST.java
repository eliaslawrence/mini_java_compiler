/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsertree;

import java.util.ArrayList;
import java_cup.non_terminal;
import javax.swing.JFrame;

/**
 *
 * @author Elias e Carlos Bruno
 */

//Abstract Syntax Tree
public class AST {
    
    //Vetor com todos simbolos nao terminais
    private String[] nonTerminal = {"Program",
        "StatementList",
        "MainClass",
        "MethodDecl",
        "MethodDeclList",
        "Statement",
        "Expression",
        "ArrayLookup",
        "ArrayLength",
        "Identifier",
        "Type",
        "VarDeclaration",
        "VarDeclarationList",
        "FormalParameter",
        "FormalParameterList",
        "FormalParameterListAndParens",
        "MethodInvocationParameterList",
        "ExpressionList",
        "ClassDecl",
        "ClassDeclList"};
    //Pai
    private String parent;
    //Lista de arvores-filhas
    private AST[] children;
    //Flag se trata-se de um terminal (sem filhos)
    private boolean terminal;    

    public AST() {
        this.parent = null;
        this.children = null;        
    }

    public AST(String parent) {
        this.parent = parent;
        this.terminal = !isNonTerminal(parent);
        this.children = null;          
    }
    //Verifica se o token esta presente no vetor de nao terminaris
    //Caso nao esteja, eh terminal
    public boolean isNonTerminal(String string) {
        return isInVector(string, this.nonTerminal);
    }

    public boolean isInVector(String string, String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (string.equals(vector[i])) {
                return true;
            }
        }
        return false;
    }

    public void setParent(String parent) {
        this.parent = parent;
        this.terminal = !isNonTerminal(parent);        
    }

    public String getParent() {
        return this.parent;
    }

    public void setChildren(String[] children) {        
        this.children = new AST[children.length];

        for (int i = 0; i < children.length; i++) {
            AST tree = new AST(children[i]);
            this.children[i] = tree;
        }
    }

    public AST[] getChildren() {
        return this.children;
    }

    public boolean getIsTerminal() {
        return this.terminal;
    }   
}
