package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierOrderRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderResponse;
import com.agroconnect.supplier_api.model.SupplierOrder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierOrderMapper {
    SupplierOrder toEntity(SupplierOrderRequest request);
    SupplierOrderResponse toResponse(SupplierOrder entity);
}