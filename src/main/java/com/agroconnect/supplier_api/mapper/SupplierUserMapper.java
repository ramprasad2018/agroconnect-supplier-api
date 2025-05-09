package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierUserRequest;
import com.agroconnect.supplier_api.dto.SupplierUserResponse;
import com.agroconnect.supplier_api.model.SupplierUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierUserMapper {
    SupplierUser toEntity(SupplierUserRequest request);
    SupplierUserResponse toResponse(SupplierUser entity);
}