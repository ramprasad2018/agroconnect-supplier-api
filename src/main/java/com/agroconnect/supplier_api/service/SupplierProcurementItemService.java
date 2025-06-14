package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierProcurementItemRequestDto;
import com.agroconnect.supplier_api.dto.SupplierProcurementItemResponseDto;
import java.util.List;

public interface SupplierProcurementItemService {
    SupplierProcurementItemResponseDto create(SupplierProcurementItemRequestDto dto);
    List<SupplierProcurementItemResponseDto> getAll();
    SupplierProcurementItemResponseDto getById(Integer id);
}
