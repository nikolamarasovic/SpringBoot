package com.SpringApp.app.repositories;

import com.SpringApp.app.domain.Book;


import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}