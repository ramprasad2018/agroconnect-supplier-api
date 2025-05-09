package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.ProductWarehouseAssignmentRequest;
import com.agroconnect.supplier_api.dto.ProductWarehouseAssignmentResponse;
import com.agroconnect.supplier_api.model.ProductWarehouseAssignment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductWarehouseAssignmentMapper {
    ProductWarehouseAssignment toEntity(ProductWarehouseAssignmentRequest request);
    ProductWarehouseAssignmentResponse toResponse(ProductWarehouseAssignment entity);
}