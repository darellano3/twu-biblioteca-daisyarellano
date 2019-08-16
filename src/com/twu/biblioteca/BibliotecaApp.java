package com.twu.biblioteca;
import java.util.Date;
import java.io.*;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

    }


    public void run(PrintStream printStream) {
        printStream.print("Welcome: hi whats up");
        //showMenu(printStream);
    }

    public void showMenu(PrintStream printStream, List<String> listBooks){
        printStream.print("Here is a list of books: ");
        for (String book: listBooks)
                printStream.println(book);
    }
}
