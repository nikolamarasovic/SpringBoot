package com.SpringApp.app.controllers;

import java.util.List;

import com.SpringApp.app.ViewModels.BookViewModel;

import com.SpringApp.app.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private final BookService service;
    String data;

    public ApiController(final BookService service) {
        this.service = service;
    }

    @GetMapping("/api/books")
    public List<BookViewModel> GetBooksJson() {
        List<BookViewModel> books = service.listAll();
        return books;
    }

    @GetMapping("/api/books/{id}")
    public BookViewModel GetBooksJson(@PathVariable("id")int id) {
        BookViewModel book = service.getBookView(id);
        return book;
    }
}