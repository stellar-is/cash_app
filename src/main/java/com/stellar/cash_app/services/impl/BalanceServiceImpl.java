package com.stellar.cash_app.services.impl;

import com.stellar.cash_app.mappers.BalanceMapper;
import com.stellar.cash_app.models.dtos.BalanceDTO;
import com.stellar.cash_app.repos.BalanceRepo;
import com.stellar.cash_app.services.BalanceService;
import org.springframework.stereotype.Service;

@Service
public class BalanceServiceImpl implements BalanceService {
    private final BalanceRepo balanceRepo;
    private final BalanceMapper balanceMapper;
    public BalanceServiceImpl(BalanceRepo balanceRepo){
        this.balanceRepo = balanceRepo;
        this.balanceMapper = BalanceMapper.INSTANCE;
    }

    @Override
    public BalanceDTO saveBalance(Double balance, Double reservedBalance) {
        BalanceDTO balanceDTO = new BalanceDTO(balance,reservedBalance);
        return balanceMapper.toDto(balanceRepo.save(balanceMapper.toEntity(balanceDTO)));
    }

    @Override
    public BalanceDTO findById(Long id) {
        return balanceMapper.toDto(balanceRepo.findById(id).get());
    }
}
