package com.stellar.cash_app.services.impl;

import com.stellar.cash_app.mappers.AccountMapper;
import com.stellar.cash_app.models.Account;
import com.stellar.cash_app.models.dtos.AccountDTO;
import com.stellar.cash_app.repos.AccountRepo;
import com.stellar.cash_app.services.AccountService;
import com.stellar.cash_app.services.BalanceService;
import com.stellar.cash_app.services.ClientService;
import org.springframework.stereotype.Service;
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountMapper accountMapper;
    private final AccountRepo accountRepo;
    private final ClientService clientService;
    private final BalanceService balanceService;

    public AccountServiceImpl(AccountRepo accountRepo, ClientService clientService,
                               BalanceService balanceService) {
        this.accountMapper = AccountMapper.INSTANCE;
        this.accountRepo = accountRepo;
        this.clientService = clientService;
        this.balanceService = balanceService;
    }

    @Override
    public AccountDTO saveAccount(Long accountNumber, Long clientId, Long balanceId) {
        AccountDTO account = new AccountDTO(accountNumber,clientService.findById(clientId),
                balanceService.findById(balanceId));
        return accountMapper.toDto(accountRepo.save(accountMapper.toEntity(account)));

    }

    @Override
    public AccountDTO findById(Long accountId) {
        return accountMapper.toDto(accountRepo.findById(accountId).get());
    }
}
