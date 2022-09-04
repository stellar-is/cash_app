package com.stellar.cash_app.controllers;

import com.stellar.cash_app.models.dtos.OperationDTO;
import com.stellar.cash_app.models.enums.OperationStatus;
import com.stellar.cash_app.models.enums.OperationType;
import com.stellar.cash_app.services.OperationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/cash_app/operation")
public class OperationController {
    private final OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }
    @PostMapping("/save")
    public OperationDTO save(Long clientId, Long atmId, Long accountId, OperationStatus operationStatus,
                             OperationType operationType, Date operationDate, Double sum){
        return operationService.saveOperation(clientId, atmId, accountId, operationStatus, operationType, operationDate, sum);

    }
}
