package com.stellar.cash_app.services.impl;

import com.stellar.cash_app.mappers.BanknoteMapper;
import com.stellar.cash_app.models.dtos.BanknoteDTO;
import com.stellar.cash_app.repos.BanknoteRepo;
import com.stellar.cash_app.services.BanknoteService;
import org.springframework.stereotype.Service;

@Service
public class BanknoteServiceImpl implements BanknoteService {
    private final BanknoteMapper banknoteMapper;
    private final BanknoteRepo banknoteRepo;

    public BanknoteServiceImpl(BanknoteRepo banknoteRepo) {
        this.banknoteMapper = BanknoteMapper.INSTANCE;
        this.banknoteRepo = banknoteRepo;
    }

    @Override
    public BanknoteDTO saveBanknote(Double value) {
        BanknoteDTO banknoteDTO = new BanknoteDTO(value);
      return banknoteMapper.toDto(banknoteRepo.save(banknoteMapper.toEntity(banknoteDTO)));
    }

    @Override
    public BanknoteDTO findById(Long banknoteId) {
        return banknoteMapper.toDto(banknoteRepo.findById(banknoteId).get());
    }
}
