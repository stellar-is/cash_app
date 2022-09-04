package com.stellar.cash_app.models;

import com.stellar.cash_app.models.enums.OperationStatus;
import com.stellar.cash_app.models.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "atm_id")
    private ATM atm;
    private Date operation_date;
    private Double sum;
    private OperationType operationType;
    private OperationStatus operationStatus;


}
