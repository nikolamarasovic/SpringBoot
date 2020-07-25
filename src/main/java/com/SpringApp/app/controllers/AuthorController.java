package com.SpringApp.app.controllers;

import java.util.List;
import java.util.Set;

import com.SpringApp.app.domain.Author;
import com.SpringApp.app.ViewModels.AuthorViewModel;

import com.SpringApp.app.services.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorController {
    @Autowired
    private final AuthorService service;
    Set<Author> author;

    public AuthorController(final AuthorService service) {
        this.service = service;
    }

    @RequestMapping("/authors")
    public String viewHome(final Model model) {
        final List<AuthorViewModel> authors = service.listAll();
        model.addAttribute("authors", authors);
        return "authors/list";
    }

    @RequestMapping("/addNewAuthor")
    public String addNewAuthor(final Model model) {
        final Author author = new Author();
        model.addAttribute("author", author);
        return "authors/newAuthor";
    }

    @RequestMapping(value = "/saveAuthor", method = RequestMethod.POST)
    public String saveAuthor(@ModelAttribute("author") Author author) {
        service.save(author);
        return "redirect:/authors";
    }

    @RequestMapping("/deleteAuthor/{id}")
    public String deleteAuthor(@PathVariable("id") int id) {
    service.deleteAuthor(id);
    return "redirect:/authors";
    }
}