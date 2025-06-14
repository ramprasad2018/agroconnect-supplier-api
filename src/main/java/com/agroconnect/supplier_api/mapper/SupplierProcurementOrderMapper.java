package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierProcurementOrderRequest;
import com.agroconnect.supplier_api.dto.SupplierProcurementOrderResponse;
import com.agroconnect.supplier_api.model.SupplierProcurementOrder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierProcurementOrderMapper {
    SupplierProcurementOrder toEntity(SupplierProcurementOrderRequest request);
    SupplierProcurementOrderResponse toResponse(SupplierProcurementOrder entity);
}