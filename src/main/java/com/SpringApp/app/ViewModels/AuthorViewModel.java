package com.SpringApp.app.ViewModels;

import com.SpringApp.app.domain.Author;
import com.SpringApp.app.domain.Book;

public class AuthorViewModel {
    public int id;
    public String title;
    public String authorName;

    public AuthorViewModel(Author author) {
        id = author.getId();
        authorName = author.getFirstName() + ' ' + author.getLastName();
        author.getBooks().forEach(book -> title += book.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getAuthorNames() {
        return authorName;
    }
    
}