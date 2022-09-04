package com.stellar.cash_app.controllers;

import com.stellar.cash_app.models.dtos.AccountDTO;
import com.stellar.cash_app.services.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cash_app/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/save")
    public AccountDTO save(Long accountNumber, Long clientId, Long balanceId){
        return accountService.saveAccount(accountNumber,clientId,balanceId);
    }

}
