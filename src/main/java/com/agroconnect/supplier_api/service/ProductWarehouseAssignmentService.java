package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.ProductWarehouseAssignmentRequest;
import com.agroconnect.supplier_api.dto.ProductWarehouseAssignmentResponse;

import java.util.List;

public interface ProductWarehouseAssignmentService {
    ProductWarehouseAssignmentResponse create(ProductWarehouseAssignmentRequest request);
    ProductWarehouseAssignmentResponse getById(Integer id);
    List<ProductWarehouseAssignmentResponse> getAll();
    ProductWarehouseAssignmentResponse update(Integer id, ProductWarehouseAssignmentRequest request);
    void delete(Integer id);
}