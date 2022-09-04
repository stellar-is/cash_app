package com.stellar.cash_app.mappers;

import com.stellar.cash_app.models.Operation;
import com.stellar.cash_app.models.dtos.OperationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OperationMapper extends BaseMapper<Operation, OperationDTO>{
    OperationMapper INSTANCE = Mappers.getMapper(OperationMapper.class);
}
