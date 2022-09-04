package com.stellar.cash_app.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BalanceDTO {
    private Long id;
    private Double balance;
    private Double reservedBalance;

    public BalanceDTO(Double balance, Double reservedBalance) {
        this.balance = balance;
        this.reservedBalance = reservedBalance;
    }
}
