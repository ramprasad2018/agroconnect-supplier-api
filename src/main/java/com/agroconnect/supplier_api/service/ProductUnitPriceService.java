package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.ProductUnitPriceRequest;
import com.agroconnect.supplier_api.dto.ProductUnitPriceResponse;

import java.util.List;

public interface ProductUnitPriceService {
    ProductUnitPriceResponse create(ProductUnitPriceRequest request);
    ProductUnitPriceResponse getById(Integer id);
    List<ProductUnitPriceResponse> getAll();
    ProductUnitPriceResponse update(Integer id, ProductUnitPriceRequest request);
    void delete(Integer id);
}