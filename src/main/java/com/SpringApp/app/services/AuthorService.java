package com.SpringApp.app.services;

import java.util.ArrayList;
import java.util.List;

import com.SpringApp.app.ViewModels.AuthorViewModel;
import com.SpringApp.app.domain.Author;
import com.SpringApp.app.repositories.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repo;
    
    public List<AuthorViewModel> listAll() {
        Iterable<Author> authors = repo.findAll();
        List<AuthorViewModel> authorViewModels = new ArrayList<AuthorViewModel>();

        authors.forEach(author -> authorViewModels.add(new AuthorViewModel(author)));

        return authorViewModels;
    }
    public void save(Author author){
        repo.save(author);
    }
    public Author getAuthor(Integer id){
        return repo.findById(id).get();
    }
    public void deleteAuthor(Integer id){
        repo.deleteById(id);
    }
}