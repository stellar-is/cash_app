package com.stellar.cash_app.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OperationBanknotesDTO {
    private Long id;
    private OperationDTO operation;
    private BanknoteDTO banknote;
    private Long banknotesAmount;

    public OperationBanknotesDTO(OperationDTO operation, BanknoteDTO banknote, Long banknotesAmount) {
        this.operation = operation;
        this.banknote = banknote;
        this.banknotesAmount = banknotesAmount;
    }
}

