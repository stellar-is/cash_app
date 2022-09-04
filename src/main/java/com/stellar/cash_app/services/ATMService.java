package com.stellar.cash_app.services;

import com.stellar.cash_app.models.dtos.ATMDTO;

public interface ATMService {
    ATMDTO saveATM(Long ATMNumber, Double balance);
    ATMDTO findById(Long atmId);
    ATMDTO refillAtmBalance(Long atmId,double sum);
}
