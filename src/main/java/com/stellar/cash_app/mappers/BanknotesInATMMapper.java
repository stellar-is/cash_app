package com.stellar.cash_app.mappers;

import com.stellar.cash_app.models.BanknotesInATM;
import com.stellar.cash_app.models.dtos.BanknotesInATMDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BanknotesInATMMapper extends BaseMapper<BanknotesInATM, BanknotesInATMDTO>{
    BanknotesInATMMapper INSTANCE = Mappers.getMapper(BanknotesInATMMapper.class);
}
