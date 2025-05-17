package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierOrderItemRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderItemResponse;
import com.agroconnect.supplier_api.model.SupplierOrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierOrderItemMapper {
    SupplierOrderItem toEntity(SupplierOrderItemRequest request);
    SupplierOrderItemResponse toResponse(SupplierOrderItem entity);
}