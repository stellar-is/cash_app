package com.stellar.cash_app.mappers;

import com.stellar.cash_app.models.Banknote;
import com.stellar.cash_app.models.dtos.BanknoteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BanknoteMapper extends BaseMapper<Banknote, BanknoteDTO>{
    BanknoteMapper INSTANCE = Mappers.getMapper(BanknoteMapper.class);

}
