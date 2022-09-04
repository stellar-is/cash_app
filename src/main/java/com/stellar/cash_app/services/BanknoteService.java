package com.stellar.cash_app.services;

import com.stellar.cash_app.models.dtos.BanknoteDTO;

public interface BanknoteService {
    BanknoteDTO saveBanknote(Double value);
    BanknoteDTO findById(Long banknoteId);
}
