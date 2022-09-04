package com.stellar.cash_app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BanknotesInATM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "banknote_id")
    private Banknote banknote;
    @ManyToOne
    @JoinColumn(name = "atm_id")
    private ATM atm;
    private Long amount;


}
