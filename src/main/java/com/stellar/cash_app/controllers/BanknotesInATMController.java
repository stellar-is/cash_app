package com.stellar.cash_app.controllers;

import com.stellar.cash_app.models.dtos.BanknotesInATMDTO;
import com.stellar.cash_app.services.BanknotesInATMService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cash_app/moneyinatm")
public class BanknotesInATMController {
    private final BanknotesInATMService banknotesInATMService;

    public BanknotesInATMController(BanknotesInATMService banknotesInATMService) {
        this.banknotesInATMService = banknotesInATMService;
    }
    @PostMapping("/save")
    public BanknotesInATMDTO save(Long banknoteId, Long atmId, Long amount){
        return banknotesInATMService.saveBanknotesInATM(banknoteId, atmId, amount);
    }

}
