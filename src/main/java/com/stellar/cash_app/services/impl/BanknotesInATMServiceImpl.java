package com.stellar.cash_app.services.impl;

import com.stellar.cash_app.mappers.BanknotesInATMMapper;
import com.stellar.cash_app.models.dtos.ATMDTO;
import com.stellar.cash_app.models.dtos.BanknoteDTO;
import com.stellar.cash_app.models.dtos.BanknotesInATMDTO;
import com.stellar.cash_app.repos.BanknotesInATMRepo;
import com.stellar.cash_app.services.ATMService;
import com.stellar.cash_app.services.BanknoteService;
import com.stellar.cash_app.services.BanknotesInATMService;
import org.springframework.stereotype.Service;

@Service
public class BanknotesInATMServiceImpl implements BanknotesInATMService {
    private final BanknotesInATMRepo banknotesInATMRepo;
    private final BanknoteService banknoteService;
    private final ATMService atmService;
    private final BanknotesInATMMapper banknotesInATMMapper;
    public BanknotesInATMServiceImpl(BanknotesInATMRepo banknotesInATMRepo, BanknoteService banknoteService, ATMService atmService) {
        this.banknotesInATMRepo = banknotesInATMRepo;
        this.banknoteService = banknoteService;
        this.atmService = atmService;
        this.banknotesInATMMapper = BanknotesInATMMapper.INSTANCE;
    }

    @Override
    public BanknotesInATMDTO saveBanknotesInATM(Long banknoteId, Long atmId, Long amount) {
        BanknoteDTO banknoteDTO = banknoteService.findById(banknoteId);
        ATMDTO atmdto = atmService.refillAtmBalance(atmId,banknoteDTO.getValue()*amount);
        BanknotesInATMDTO banknotesInATMDTO = new BanknotesInATMDTO(banknoteDTO,
                atmdto,amount);
       return banknotesInATMMapper.toDto(banknotesInATMRepo.save(banknotesInATMMapper.toEntity(banknotesInATMDTO)));

    }
}
