package com.stellar.cash_app.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BanknotesInATMDTO {
    private Long id;
    private BanknoteDTO banknote;
    private ATMDTO atm;
    private Long amount;

    public BanknotesInATMDTO(BanknoteDTO banknote, ATMDTO atm, Long amount) {
        this.banknote = banknote;
        this.atm = atm;
        this.amount = amount;
    }
}
