package com.stellar.cash_app.controllers;

import com.stellar.cash_app.models.dtos.ATMDTO;
import com.stellar.cash_app.services.ATMService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cash_app/atm")
public class ATMController {
    private final ATMService atmService;

    public ATMController(ATMService atmService) {
        this.atmService = atmService;
    }

    @PostMapping("/save")
    public ATMDTO save(Long atmNumber, Double balance){
        return atmService.saveATM(atmNumber,balance);
    }
}
