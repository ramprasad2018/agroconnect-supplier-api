package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.ProductRequest;
import com.agroconnect.supplier_api.dto.ProductResponse;
import com.agroconnect.supplier_api.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductRequest request);
    ProductResponse toResponse(Product entity);
}