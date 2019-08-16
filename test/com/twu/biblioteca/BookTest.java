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

public class BookTest {
    private List<Book> listBooks = new ArrayList<Book>();
    Book b1;

    @Before
    public void setup(){
        b1 = new Book("Not Your Perfect Mexican Daughter","Erika Sanchez", 2016);
        listBooks.add(b1);
       }

    @Test
    public void  correctlyConstructedTest(){
        assertThat(b1.toString(), is(String.join(", ",
                "Not Your Perfect Mexican Daughter",
                "Erika Sanchez",
                "2016")));
    }




}