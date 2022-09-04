package com.stellar.cash_app.services.impl;

import com.stellar.cash_app.mappers.OperationMapper;
import com.stellar.cash_app.models.dtos.OperationDTO;
import com.stellar.cash_app.models.enums.OperationStatus;
import com.stellar.cash_app.models.enums.OperationType;
import com.stellar.cash_app.repos.OperationRepo;
import com.stellar.cash_app.services.ATMService;
import com.stellar.cash_app.services.AccountService;
import com.stellar.cash_app.services.ClientService;
import com.stellar.cash_app.services.OperationService;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class OperationServiceImpl implements OperationService {
    private final OperationRepo operationRepo;
    private final ClientService clientService;
    private final ATMService atmService;
    private final AccountService accountService;
    private final OperationMapper operationMapper;

    public OperationServiceImpl(OperationRepo operationRepo, ClientService clientService, ATMService atmService, AccountService accountService) {
        this.operationRepo = operationRepo;
        this.clientService = clientService;
        this.atmService = atmService;
        this.accountService = accountService;
        this.operationMapper = OperationMapper.INSTANCE;
    }

    @Override
    public OperationDTO saveOperation(Long clientId, Long atmId, Long accountId, OperationStatus operationStatus,
                                      OperationType operationType, Date operationDate, Double sum) {
        OperationDTO operationDTO = new OperationDTO(clientService.findById(clientId),
                accountService.findById(accountId),atmService.findById(atmId),
                operationDate,sum,operationType,operationStatus);
       return operationMapper.toDto(operationRepo.save(operationMapper.toEntity(operationDTO)));
    }

    @Override
    public OperationDTO findById(Long operationId) {
        return operationMapper.toDto(operationRepo.findById(operationId).get());
    }
}
