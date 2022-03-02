package com.JavaFundamentals.linter.app.src.main.java.linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lab03 {


    public void fileReader() throws FileNotFoundException {
        String name = "gates.js";

        File file = new File(name);

        Scanner scanner = new Scanner(file);

        int noOfLine = 0;

        while (scanner.hasNextLine()) {

            noOfLine++;

            String readLine = scanner.nextLine();

        if (readLine.length() > 0) {// ignore empty lines

        char lastCharacter = readLine.charAt(readLine.length() - 1);// look at the last letter and see if there's normal braces.

        if (lastCharacter != '{' && lastCharacter != '}' && lastCharacter != ';') {

        if (!readLine.contains("if") && !readLine.contains("else")) {
                        String err = "LINE " + noOfLine + ": missing semicolon The line content is =>" + readLine;
                        System.out.println(err);
                    }
                }
            }
        }

    }


}
