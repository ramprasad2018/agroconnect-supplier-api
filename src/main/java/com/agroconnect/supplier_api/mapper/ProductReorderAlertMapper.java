package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.ProductReorderAlertRequest;
import com.agroconnect.supplier_api.dto.ProductReorderAlertResponse;
import com.agroconnect.supplier_api.model.ProductReorderAlert;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductReorderAlertMapper {
    ProductReorderAlert toEntity(ProductReorderAlertRequest request);
    ProductReorderAlertResponse toResponse(ProductReorderAlert entity);
}