package com.stellar.cash_app.models.dtos;

import com.stellar.cash_app.models.enums.OperationStatus;
import com.stellar.cash_app.models.enums.OperationType;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
public class OperationDTO {
    private Long id;
    private ClientDTO client;
    private AccountDTO account;
    private ATMDTO atm;
    private Date operation_date;
    private Double sum;
    private OperationType operationType;
    private OperationStatus operationStatus;

    public OperationDTO(ClientDTO client, AccountDTO account, ATMDTO atm, Date operation_date, Double sum, OperationType operationType, OperationStatus operationStatus) {
        this.client = client;
        this.account = account;
        this.atm = atm;
        this.operation_date = operation_date;
        this.sum = sum;
        this.operationType = operationType;
        this.operationStatus = operationStatus;
    }
}
