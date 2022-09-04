package com.stellar.cash_app.services.impl;

import com.stellar.cash_app.mappers.OperationBanknotesMapper;
import com.stellar.cash_app.models.dtos.OperationBanknotesDTO;
import com.stellar.cash_app.repos.OperationBanknotesRepo;
import com.stellar.cash_app.services.BanknoteService;
import com.stellar.cash_app.services.OperationBanknotesService;
import com.stellar.cash_app.services.OperationService;
import org.springframework.stereotype.Service;

@Service
public class OperationBanknotesServiceImpl implements OperationBanknotesService {
    private final OperationBanknotesRepo operationBanknotesRepo;
    private final OperationService operationService;
    private final BanknoteService banknoteService;
    private final OperationBanknotesMapper operationBanknotesMapper;

    public OperationBanknotesServiceImpl(OperationBanknotesRepo operationBanknotesRepo, OperationService operationService, BanknoteService banknoteService) {
        this.operationBanknotesRepo = operationBanknotesRepo;
        this.operationService = operationService;
        this.banknoteService = banknoteService;
        this.operationBanknotesMapper = OperationBanknotesMapper.INSTANCE;
    }

    @Override
    public OperationBanknotesDTO saveOperationBanknotes(Long operationId, Long banknoteId, Long banknotesAmount) {
        OperationBanknotesDTO operationBanknotesDTO = new OperationBanknotesDTO(operationService.findById(operationId),
                banknoteService.findById(banknoteId), banknotesAmount);
       return operationBanknotesMapper.toDto(operationBanknotesRepo.save(operationBanknotesMapper.toEntity(operationBanknotesDTO)));
    }
}
