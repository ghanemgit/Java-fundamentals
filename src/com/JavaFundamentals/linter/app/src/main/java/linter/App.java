/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.JavaFundamentals.linter.app.src.main.java.linter;
import java.io.*;
import java.util.Scanner;


public class App {


    public static void main(String[] args) throws IOException {

        Lab03 test = new Lab03();

        try {
            test.fileReader();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

