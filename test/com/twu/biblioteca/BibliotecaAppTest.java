

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
     private List<String> listBooks;

    @Before
    public void setup(){
        testBib = new BibliotecaApp();
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        listBooks = Arrays.asList("Not Your Perfect Mexican Daughter", "The Scarlet letter");
    }

    @Test
    public void welcomeTest() {
        testBib.welcomeMessage(printStream);
        assertThat(outputStream.toString(), is("Welcome:\n"));
    }

    @Test
    public void showBooksTest() {
        testBib.showListBooks(printStream, listBooks);
        assertThat(outputStream.toString(), is("Here is a list of books:\nNot Your Perfect Mexican Daughter\nThe Scarlet letter\n"));
    }

    @Test
    public void runTest() {
        testBib.run(printStream);
        assertThat(outputStream.toString(), is("Welcome:\nHere is a list of books:\nNot Your Perfect Mexican Daughter\nThe Scarlet letter\n"));
    }

    

}
