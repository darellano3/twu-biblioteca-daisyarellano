package com.twu.biblioteca;
import java.util.Arrays;
import java.util.Date;
import java.io.*;
import java.util.*;

public class BibliotecaApp {
    protected List<String> listBooks = Arrays.asList("Not Your Perfect Mexican Daughter", "The Scarlet letter");
    public static void main(String[] args) {
    }

    public void run(PrintStream printStream){
        welcomeMessage(printStream);
        showListBooks(printStream, listBooks);
    }

    protected void welcomeMessage(PrintStream printStream) {
        printStream.println("Welcome:");
    }

    protected void showListBooks(PrintStream printStream, List<String> listBooks){
        printStream.println("Here is a list of books:");
        for (String book: listBooks)
                printStream.println(book);
    }


}
