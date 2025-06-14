package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierProcurementItemRequestDto;
import com.agroconnect.supplier_api.dto.SupplierProcurementItemResponseDto;
import com.agroconnect.supplier_api.model.SupplierProcurementItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierProcurementItemMapper {
    SupplierProcurementItem toEntity(SupplierProcurementItemRequestDto dto);
    SupplierProcurementItemResponseDto toResponseDto(SupplierProcurementItem item);
}
