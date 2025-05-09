package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.ProductCategoryRequest;
import com.agroconnect.supplier_api.dto.ProductCategoryResponse;

import java.util.List;

public interface ProductCategoryService {
    ProductCategoryResponse create(ProductCategoryRequest request);
    ProductCategoryResponse getById(Integer id);
    List<ProductCategoryResponse> getAll();
    ProductCategoryResponse update(Integer id, ProductCategoryRequest request);
    void delete(Integer id);
}