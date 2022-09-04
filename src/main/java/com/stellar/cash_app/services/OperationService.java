package com.stellar.cash_app.services;

import com.stellar.cash_app.models.dtos.OperationDTO;
import com.stellar.cash_app.models.enums.OperationStatus;
import com.stellar.cash_app.models.enums.OperationType;

import java.util.Date;

public interface OperationService {
    OperationDTO saveOperation(Long clientId, Long atmId, Long accountId,
                               OperationStatus operationStatus, OperationType operationType,
                                Date operationDate, Double sum);
    OperationDTO findById(Long operationId);

}
