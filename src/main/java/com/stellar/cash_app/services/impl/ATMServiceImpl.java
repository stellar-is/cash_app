package com.stellar.cash_app.services.impl;

import com.stellar.cash_app.mappers.ATMMapper;
import com.stellar.cash_app.models.dtos.ATMDTO;
import com.stellar.cash_app.repos.ATMRepo;
import com.stellar.cash_app.services.ATMService;
import org.springframework.stereotype.Service;

@Service
public class ATMServiceImpl implements ATMService {
    private final ATMRepo atmRepo;
    private final ATMMapper atmMapper;
    public ATMServiceImpl(ATMRepo atmRepo) {
        this.atmRepo = atmRepo;
        this.atmMapper = ATMMapper.INSTANCE;
    }

    @Override
    public ATMDTO saveATM(Long atmNumber, Double balance) {
        ATMDTO atmdto = new ATMDTO(atmNumber,balance);
       return atmMapper.toDto(atmRepo.save(atmMapper.toEntity(atmdto)));
    }

    @Override
    public ATMDTO findById(Long atmId) {
        return atmMapper.toDto(atmRepo.findById(atmId).get());
    }

    @Override
    public ATMDTO refillAtmBalance(Long atmId, double sum) {
       ATMDTO atmdto = findById(atmId);
       atmdto.setBalance(atmdto.getBalance()+sum);
       atmRepo.save(atmMapper.toEntity(atmdto));
        return atmMapper.toDto(atmRepo.save(atmMapper.toEntity(atmdto)));
    }

}
