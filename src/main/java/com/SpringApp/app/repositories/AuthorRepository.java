package com.SpringApp.app.repositories;

import com.SpringApp.app.domain.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}