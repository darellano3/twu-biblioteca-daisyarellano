package com.twu.biblioteca;
import java.util.Arrays;
import java.util.Date;
import java.io.*;
import java.util.*;

public class BibliotecaApp {
    protected List<Book> listBooks = new ArrayList<Book>();
    public static void main(String[] args) {
    }

    public void run(PrintStream printStream){
        welcomeMessage(printStream);
        showListBooks(printStream, listBooks);
    }

    protected void welcomeMessage(PrintStream printStream) {
        printStream.println("Welcome:");
    }

    protected void showListBooks(PrintStream printStream, List<Book> listBooks){
        printStream.println("Here is a list of books:");
        for (Book book: listBooks)
                printStream.println(book.toString());
    }

    protected void addBook(String title, String author, int year){
        Book book = new Book(title, author, year);
        listBooks.add(book);
    }



}
