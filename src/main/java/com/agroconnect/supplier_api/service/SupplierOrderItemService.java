package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierOrderItemRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderItemResponse;

import java.util.List;

public interface SupplierOrderItemService {
    SupplierOrderItemResponse create(SupplierOrderItemRequest request);
    SupplierOrderItemResponse getById(Integer id);
    List<SupplierOrderItemResponse> getAll();
    SupplierOrderItemResponse update(Integer id, SupplierOrderItemRequest request);
    void delete(Integer id);
}