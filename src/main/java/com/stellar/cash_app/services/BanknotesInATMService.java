package com.stellar.cash_app.services;

import com.stellar.cash_app.models.dtos.BanknotesInATMDTO;

public interface BanknotesInATMService {
    BanknotesInATMDTO saveBanknotesInATM(Long banknoteId, Long atmId, Long amount);
}
