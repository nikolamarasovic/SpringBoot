package com.SpringApp.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.SpringApp.app.domain.Author;
import com.SpringApp.app.domain.Book;
import com.SpringApp.app.ViewModels.BookViewModel;
import com.SpringApp.app.repositories.AuthorRepository;
import com.SpringApp.app.repositories.BookRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository repo;

    public List<BookViewModel> listAll() {
        Iterable<Book> books = repo.findAll();
        List<BookViewModel> bookViewModels = new ArrayList<BookViewModel>();

        books.forEach(book -> bookViewModels.add(new BookViewModel(book)));

        return bookViewModels;
    }

    public void save(Book book) {
        repo.save(book);
    }

    public BookViewModel getBookView(Integer id) {
        Book book = repo.findById(id).get();
        return new BookViewModel(book);
    }

    public Book getBook(Integer id){
        Book book = repo.findById(id).get();
        return book;
    }
    public void deleteBook(Integer id) {
        repo.deleteById(id);
    }
}