package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.OrderReturnRequest;
import com.agroconnect.supplier_api.dto.OrderReturnResponse;
import com.agroconnect.supplier_api.model.OrderReturn;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderReturnMapper {
    OrderReturn toEntity(OrderReturnRequest request);
    OrderReturnResponse toResponse(OrderReturn entity);
}