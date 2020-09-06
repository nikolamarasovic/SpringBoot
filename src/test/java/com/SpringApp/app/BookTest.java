package com.SpringApp.app;

import static org.junit.Assert.assertEquals;
import com.SpringApp.app.ViewModels.BookViewModel;
import com.SpringApp.app.domain.Book;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
 Book book;
 BookViewModel book1;
 
 @Before
 public void setUp(){
    book = new Book();
    
 }
 @Test
 public void getId() throws Exception{
    book.setId(3);
    
    book1 = new BookViewModel(book);
    assertEquals(book.getId(),4);
 }
}
