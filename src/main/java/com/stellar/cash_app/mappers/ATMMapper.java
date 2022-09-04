package com.stellar.cash_app.mappers;

import com.stellar.cash_app.models.ATM;
import com.stellar.cash_app.models.dtos.ATMDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ATMMapper {
    ATMMapper INSTANCE = Mappers.getMapper(ATMMapper.class);

    ATM toEntity(ATMDTO atmdto);
    ATMDTO toDto(ATM atm);

}
