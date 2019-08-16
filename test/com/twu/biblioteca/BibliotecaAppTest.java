

package com.twu.biblioteca;


import com.twu.biblioteca.BibliotecaApp;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BibliotecaAppTest {



    @Test
    public void test() {
        BibliotecaApp testBib = new BibliotecaApp();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        testBib.run(printStream);
        assertThat(outputStream.toString(), is("Welcome: hi whats up"));

    }

    @Test
    public void showBooksTest() {
        BibliotecaApp testBib = new BibliotecaApp();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        List<String> listBooks = Arrays.asList("Not Your Perfect Mexican Daughter", "The Scarlet letter");
        testBib.showMenu(printStream, listBooks);
        assertThat(outputStream.toString(), is("Here is a list of books: Not Your Perfect Mexican Daughter\nThe Scarlet letter\n"));
    }


}
