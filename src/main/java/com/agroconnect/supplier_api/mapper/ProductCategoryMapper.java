package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.ProductCategoryRequest;
import com.agroconnect.supplier_api.dto.ProductCategoryResponse;
import com.agroconnect.supplier_api.model.ProductCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {
    ProductCategory toEntity(ProductCategoryRequest request);
    ProductCategoryResponse toResponse(ProductCategory entity);
}