package com.stellar.cash_app.services;

import com.stellar.cash_app.models.dtos.BalanceDTO;
import org.springframework.stereotype.Service;


public interface BalanceService {
    BalanceDTO saveBalance(Double balance,Double reservedBalance);

    BalanceDTO findById(Long balanceId);
}
