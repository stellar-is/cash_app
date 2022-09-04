package com.stellar.cash_app.controllers;

import com.stellar.cash_app.models.dtos.ClientDTO;
import com.stellar.cash_app.services.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cash_app/client")
public class ClientController {

        private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/save")
    public ClientDTO save(String name, Double limit){
        return clientService.saveClient(name,limit);
    }
}
