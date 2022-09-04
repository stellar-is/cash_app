package com.stellar.cash_app.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountDTO {
    private Long id;
    private Long accountNumber;
    private ClientDTO client;
    private BalanceDTO balance;

    public AccountDTO(Long accountNumber, ClientDTO client, BalanceDTO balance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }
}
