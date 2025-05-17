package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierOrderTrackingRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderTrackingResponse;
import com.agroconnect.supplier_api.model.SupplierOrderTracking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierOrderTrackingMapper {
    SupplierOrderTracking toEntity(SupplierOrderTrackingRequest request);
    SupplierOrderTrackingResponse toResponse(SupplierOrderTracking entity);
}