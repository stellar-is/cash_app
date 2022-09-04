package com.stellar.cash_app.services;

import com.stellar.cash_app.models.Account;
import com.stellar.cash_app.models.dtos.AccountDTO;

public interface AccountService {
    AccountDTO saveAccount(Long accountNumber, Long clientId, Long balanceId);
    AccountDTO findById(Long accountId);
}
