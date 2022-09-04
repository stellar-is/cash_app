package com.stellar.cash_app.mappers;

import com.stellar.cash_app.models.OperationBanknotes;
import com.stellar.cash_app.models.dtos.OperationBanknotesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OperationBanknotesMapper extends BaseMapper<OperationBanknotes, OperationBanknotesDTO>{
    OperationBanknotesMapper INSTANCE = Mappers.getMapper(OperationBanknotesMapper.class);
}
