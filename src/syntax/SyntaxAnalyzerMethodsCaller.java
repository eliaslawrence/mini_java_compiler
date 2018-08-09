package syntax;

import parsertree.AST;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Elias e Carlos Bruno
 */
public class SyntaxAnalyzerMethodsCaller {

    private static int count = 0;
    public static AST ast;
    public static ArrayList<String> parentsList = new ArrayList<String>();
    public static ArrayList<String> childrenList = new ArrayList<String>();

    /**
     *
     * @param args the command line arguments
     */
    //ARVORE
    public static void treeGenerator() {
        ast = new AST();
        parentsList = invertArray(parentsList);
        childrenList = invertArray(childrenList);

        if (parentsList.size() > 0) {
            ast.setParent(parentsList.get(0));
            count = 0;
            createAST(ast);
            String[] args = null;
        }
    }

    //EXECUTAR
    public static void compilar(String fileDirectory) {
        String[] arquivoTeste = {fileDirectory};
        try {
            SyntaxAnalyzer.main(arquivoTeste);
        } catch (Exception ex) {
            Logger.getLogger(SyntaxAnalyzerMethodsCaller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Gera as classes abaixo a partir dos arquivos Lexer.flex e Parser.cup :
    //'SyntaxAnalyzer': classe gerada pelo Parser.cup
    //'Yylex': classe gerada pelo Lexer.flex
    //'Sym': simbolos terminais
    public static void generateClasses() {        
        String lexicalFile = "";
        String syntaxFile = "";
        
        lexicalFile = "Lexer.flex";
        syntaxFile= "Parser.cup";

        String[] alexico = {lexicalFile};
        String[] asintatico = {"-parser", "SyntaxAnalyzer", syntaxFile};
        jflex.Main.main(alexico);
        try {
            java_cup.Main.main(asintatico);
        } catch (Exception ex) {
        }
        //movemos os arquivos gerados
        boolean mvLF = moveFile("Yylex.java");
        boolean mvSF = moveFile("SyntaxAnalyzer.java");
        boolean mvSym = moveFile("Sym.java");
        if (mvLF && mvSF && mvSym) {
            System.exit(0);
        }
    }
    
    //Move os arquivos para o diretorio raiz
    public static boolean moveFile(String fileName) {
        boolean accomplished = false;
        File file = new File(fileName);
        if (file.exists()) {
            Path currentRelativePath = Paths.get("");
            String newDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator
                    + "syntax" + File.separator + file.getName();
            File oldFile = new File(newDir);
            oldFile.delete();
            if (file.renameTo(new File(newDir))) {
                accomplished = true;
            }

        }
        return accomplished;
    }

    private static ArrayList<String> invertArray(ArrayList<String> list) {
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = list.size() - 1; i >= 0; i--) {
            temp.add(list.get(i));
        }
        list.clear();

        for (int i = 0; i < temp.size(); i++) {
            list.add(temp.get(i));
        }
        return list;
    }

    private static void createAST(AST tree) {
        if (count == parentsList.size()) {
            return;
        } else {
            String[] children = childrenList.get(count).split(" ");
            tree.setChildren(children);
            AST[] treeVector = tree.getChildren();
            for (int i = treeVector.length - 1; i >= 0; i--) {
                if (!treeVector[i].getIsTerminal()) {
                    count++;
                    createAST(treeVector[i]);
                }
            }
        }
    }
}
