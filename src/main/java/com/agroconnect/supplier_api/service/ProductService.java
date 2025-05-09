package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.ProductRequest;
import com.agroconnect.supplier_api.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse create(ProductRequest request);
    ProductResponse getById(Integer id);
    List<ProductResponse> getAll();
    ProductResponse update(Integer id, ProductRequest request);
    void delete(Integer id);
}