package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.ProductUnitPriceRequest;
import com.agroconnect.supplier_api.dto.ProductUnitPriceResponse;
import com.agroconnect.supplier_api.model.ProductUnitPrice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductUnitPriceMapper {
    ProductUnitPrice toEntity(ProductUnitPriceRequest request);
    ProductUnitPriceResponse toResponse(ProductUnitPrice entity);
}