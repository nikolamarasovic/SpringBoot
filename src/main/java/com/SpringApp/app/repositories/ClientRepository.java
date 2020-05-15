package com.SpringApp.app.repositories;

import com.SpringApp.app.domain.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}