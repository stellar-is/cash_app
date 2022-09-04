package com.stellar.cash_app.mappers;

import com.stellar.cash_app.models.Client;
import com.stellar.cash_app.models.dtos.ClientDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientsMapper extends BaseMapper<Client, ClientDTO>{
    ClientsMapper INSTANCE = Mappers.getMapper(ClientsMapper.class);
}
