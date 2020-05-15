package com.SpringApp.app.controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.SpringApp.app.domain.Author;
import com.SpringApp.app.domain.Book;
import com.SpringApp.app.ViewModels.BookViewModel;
import com.SpringApp.app.services.BookService;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    private final BookService service;
    Set<Author> author;

    public BookController(final BookService service) {
        this.service = service;
    }

    @RequestMapping("/books")
    public String viewHome(final Model model) {
        final List<BookViewModel> books = service.listAll();
        model.addAttribute("books", books);
        return "books/list";
    }

    @RequestMapping("/addNewBook")
    public String addNewBook(final Model model) {
        final Book book = new Book();
        model.addAttribute("book", book);
        return "books/newBook";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute("book") Book book) {
        service.save(book);
        return "redirect:/books";
    }

    @RequestMapping("/edit/{id}")
    public String showEditBook(@PathVariable("id") int id, Model model) {
    final Book book = service.getBook(id);
    model.addAttribute("book", book);
    return "books/editBook";
    }
    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id) {
    service.deleteBook(id);
    return "redirect:/books";
    }
}