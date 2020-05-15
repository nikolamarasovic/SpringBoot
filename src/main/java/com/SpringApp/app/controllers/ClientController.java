package com.SpringApp.app.controllers;

import java.util.List;

import com.SpringApp.app.domain.Client;
import com.SpringApp.app.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
    @Autowired
    private final ClientService service;
    
    public ClientController(ClientService service) {
        this.service = service;
    }

    @RequestMapping("/clients")
    public String viewHome(Model model){
        List<Client> clients = service.listAll();
        model.addAttribute("clients", clients);
        return "clients/list";
    }
        
}