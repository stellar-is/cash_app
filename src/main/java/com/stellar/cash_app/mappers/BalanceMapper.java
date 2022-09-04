package com.stellar.cash_app.mappers;

import com.stellar.cash_app.models.Balance;
import com.stellar.cash_app.models.dtos.BalanceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BalanceMapper extends BaseMapper<Balance, BalanceDTO>{
    BalanceMapper INSTANCE = Mappers.getMapper(BalanceMapper.class);
}
