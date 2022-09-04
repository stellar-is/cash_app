package com.stellar.cash_app.mappers;

import com.stellar.cash_app.models.Account;
import com.stellar.cash_app.models.dtos.AccountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    Account toEntity(AccountDTO accountDTO);
    AccountDTO toDto(Account account);
}
