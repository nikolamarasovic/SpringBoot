package com.SpringApp.app;

import static org.junit.Assert.assertEquals;

import com.SpringApp.app.domain.Author;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {
 Author author;
 
 @Before
 public void setUp(){
    author = new Author();
 }
 @Test
 public void getId() throws Exception{
    author.setId(2);
     assertEquals(2, author.getId());
 }
}