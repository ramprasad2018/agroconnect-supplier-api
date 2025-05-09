package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierRoleRequest;
import com.agroconnect.supplier_api.dto.SupplierRoleResponse;
import com.agroconnect.supplier_api.model.SupplierRole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierRoleMapper {
    SupplierRole toEntity(SupplierRoleRequest request);
    SupplierRoleResponse toResponse(SupplierRole entity);
}