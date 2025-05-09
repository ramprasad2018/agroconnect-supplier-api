package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.ProductStockRequest;
import com.agroconnect.supplier_api.dto.ProductStockResponse;
import com.agroconnect.supplier_api.model.ProductStock;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductStockMapper {
    ProductStock toEntity(ProductStockRequest request);
    ProductStockResponse toResponse(ProductStock entity);
}