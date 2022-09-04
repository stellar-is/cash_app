package com.stellar.cash_app.services;

import com.stellar.cash_app.models.dtos.OperationBanknotesDTO;

public interface OperationBanknotesService {
    OperationBanknotesDTO saveOperationBanknotes(Long operationId, Long banknoteId, Long banknotesAmount);
}
