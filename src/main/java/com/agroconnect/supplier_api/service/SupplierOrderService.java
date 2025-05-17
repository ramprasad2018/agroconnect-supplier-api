package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierOrderRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderResponse;

import java.util.List;

public interface SupplierOrderService {
    SupplierOrderResponse create(SupplierOrderRequest request);
    SupplierOrderResponse getById(Integer id);
    List<SupplierOrderResponse> getAll();
    SupplierOrderResponse update(Integer id, SupplierOrderRequest request);
    void delete(Integer id);
}