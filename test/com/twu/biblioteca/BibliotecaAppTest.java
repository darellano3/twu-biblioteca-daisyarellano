

package com.twu.biblioteca;


import com.twu.biblioteca.BibliotecaApp;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BibliotecaAppTest {
     private BibliotecaApp testBib;
     private PrintStream printStream;
     private ByteArrayOutputStream outputStream;
     private List<Book> listBooks = new ArrayList<Book>();
     private Book b1;

    @Before
    public void setup(){
        testBib = new BibliotecaApp();
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        Book b1 = new Book("Not Your Perfect Mexican Daughter","Erika Sanchez", 2016);
        Book b2 = new Book("TFIOS", "Jhon Greene", 2015);
        listBooks.add(b1);
        listBooks.add(b2);
        testBib.addBook("Not Your Perfect Mexican Daughter","Erika Sanchez", 2016);
        testBib.addBook("TFIOS", "Jhon Greene", 2015);
    }

    @Test
    public void welcomeTest() {
        testBib.welcomeMessage(printStream);
        assertThat(outputStream.toString(), is("Welcome:\n"));
    }

    @Test
    public void showBooksTest() {
        testBib.showListBooks(printStream, listBooks);
        assertThat(outputStream.toString(), is("Here is a list of books:\nNot Your Perfect Mexican Daughter, Erika Sanchez, 2016\nTFIOS, Jhon Greene, 2015\n"));
    }

    @Test
    public void runTest() {
        testBib.run(printStream);
        assertThat(outputStream.toString(), is("Welcome:\nHere is a list of books:\nNot Your Perfect Mexican Daughter, Erika Sanchez, 2016\nTFIOS, Jhon Greene, 2015\n"));
    }


}
