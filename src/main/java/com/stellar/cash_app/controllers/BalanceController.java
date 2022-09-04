package com.stellar.cash_app.controllers;

import com.stellar.cash_app.models.dtos.BalanceDTO;
import com.stellar.cash_app.services.BalanceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cash_app/balance")
public class BalanceController {
    private final BalanceService balanceService;

    public BalanceController(BalanceService balanceService) {
        this.balanceService = balanceService;
    }
    @PostMapping("/save")
    public BalanceDTO save(Double balance, Double reservedBalance){
        return balanceService.saveBalance(balance,reservedBalance);
    }
}
