package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.ProductReorderAlertRequest;
import com.agroconnect.supplier_api.dto.ProductReorderAlertResponse;

import java.util.List;

public interface ProductReorderAlertService {
    ProductReorderAlertResponse create(ProductReorderAlertRequest request);
    ProductReorderAlertResponse getById(Integer id);
    List<ProductReorderAlertResponse> getAll();
    ProductReorderAlertResponse update(Integer id, ProductReorderAlertRequest request);
    void delete(Integer id);
}