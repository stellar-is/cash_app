package com.stellar.cash_app.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ATMDTO {
    private Long id;
    private Long number;

    public ATMDTO(Long number, Double balance) {
        this.number = number;
        this.balance = balance;
    }

    private Double balance;
}
