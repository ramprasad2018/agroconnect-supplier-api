package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.ProductStockRequest;
import com.agroconnect.supplier_api.dto.ProductStockResponse;

import java.util.List;

public interface ProductStockService {
    ProductStockResponse create(ProductStockRequest request);
    ProductStockResponse getById(Integer id);
    List<ProductStockResponse> getAll();
    ProductStockResponse update(Integer id, ProductStockRequest request);
    void delete(Integer id);
}