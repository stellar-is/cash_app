package com.stellar.cash_app.controllers;

import com.stellar.cash_app.models.dtos.BanknoteDTO;
import com.stellar.cash_app.services.BanknoteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cash_app/money")
public class BanknoteController {
    private final BanknoteService banknoteService;

    public BanknoteController(BanknoteService banknoteService) {
        this.banknoteService = banknoteService;
    }
    @PostMapping("/save")
    public BanknoteDTO save(Double value){
        return banknoteService.saveBanknote(value);
    }
}
