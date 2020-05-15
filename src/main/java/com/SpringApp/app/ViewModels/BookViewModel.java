package com.SpringApp.app.ViewModels;


import com.SpringApp.app.domain.Book;

public class BookViewModel {
    public int id;
    public String title;
    public String authorNames;

    public BookViewModel(Book book){
        id = book.getId();
        title = book.getTitle();
        authorNames = "";
        book.getAuthors().forEach(author -> authorNames += (author.getFirstName() +' ' + author.getLastName()));
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getAuthorNames() {
        return authorNames;
    }
    
}