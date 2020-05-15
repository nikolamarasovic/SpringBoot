package com.SpringApp.app.services;

import java.util.List;

import com.SpringApp.app.domain.Client;
import com.SpringApp.app.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repo;
    public List <Client> listAll(){
        return (List<Client>) repo.findAll();
    }
    public void save(Client client){
        repo.save(client);
    }
    public Client getClient(Integer id){
        return repo.findById(id).get();
    }
    public void deleteClient(Integer id){
        repo.deleteById(id);
    }
}