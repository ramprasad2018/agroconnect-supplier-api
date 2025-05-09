package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierRequest;
import com.agroconnect.supplier_api.dto.SupplierResponse;
import com.agroconnect.supplier_api.model.Supplier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
    Supplier toEntity(SupplierRequest request);
    SupplierResponse toResponse(Supplier entity);
}