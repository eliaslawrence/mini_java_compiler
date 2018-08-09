/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexical;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elias e Carlos Bruno
 */
public class FileStack {

    private String fileName;

    public FileStack(String fileName) {        
        this.fileName = fileName;
                
        //Libera arquivo
        Formatter clearFile = null;

        String firstToken = "";
        String temp = "";
        try {
            //FileStack ---> Temp            
            clearFile = new Formatter(fileName);
            clearFile.close();

        } catch (Exception ex) {
        }
    }

    @Override
    public String toString() {
        Scanner fileStack = null;
        String fileContent = "";
        try {
            fileStack = new Scanner(new File(this.fileName));
            while (fileStack.hasNextLine()) {
                fileContent = fileContent.concat(fileStack.nextLine());
            }
            fileStack.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileStack.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileContent;
    }

    public String push(String token) {
        Scanner fileStackRead = null;
        Formatter tempFileWrite = null;

        String firstToken = "";
        String temp = "";
        try {
            //FileStack ---> Temp
            fileStackRead = new Scanner(new File(this.fileName));
            tempFileWrite = new Formatter("temp.txt");

            tempFileWrite.format("%s\n", token);

            while (fileStackRead.hasNextLine()) {
                temp = fileStackRead.nextLine();
                tempFileWrite.format("%s\n", temp);
            }
            fileStackRead.close();
            tempFileWrite.close();

            //Temp ---> FileStack
            Scanner tempFileRead = null;
            Formatter fileStackWrite = null;

            tempFileRead = new Scanner(new File("temp.txt"));
            fileStackWrite = new Formatter(this.fileName);

            while (tempFileRead.hasNextLine()) {
                temp = tempFileRead.nextLine();
                fileStackWrite.format("%s\n", temp);
            }
            fileStackWrite.close();
            tempFileRead.close();

        } catch (Exception ex) {
        }
        return token;
    }

    public String pop() {
        Scanner fileStackRead = null;
        Formatter tempFileWrite = null;

        String firstToken = "";
        String temp = "";
        try {
            //FileStack ---> Temp
            fileStackRead = new Scanner(new File(this.fileName));
            tempFileWrite = new Formatter("temp.txt");
            firstToken = fileStackRead.nextLine();
            while (fileStackRead.hasNextLine()) {
                temp = fileStackRead.nextLine();
                tempFileWrite.format("%s\n", temp);
            }
            fileStackRead.close();
            tempFileWrite.close();

            //Temp ---> FileStack
            Scanner tempFileRead = null;
            Formatter fileStackWrite = null;

            tempFileRead = new Scanner(new File("temp.txt"));
            fileStackWrite = new Formatter(this.fileName);

            while (tempFileRead.hasNextLine()) {
                temp = tempFileRead.nextLine();
                fileStackWrite.format("%s\n", temp);
            }
            fileStackWrite.close();
            tempFileRead.close();

        } catch (Exception ex) {
        }
        return firstToken;
    }

    public void clear() {
        //Limpa arquivo
        Formatter clearFile = null;

        String firstToken = "";
        String temp = "";
        try {
            //FileStack ---> Temp            
            clearFile = new Formatter(this.fileName);
            clearFile.close();

        } catch (Exception ex) {
        }
    }
}
