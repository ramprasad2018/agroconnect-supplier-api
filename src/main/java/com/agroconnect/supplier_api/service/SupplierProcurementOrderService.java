package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierProcurementOrderRequest;
import com.agroconnect.supplier_api.dto.SupplierProcurementOrderResponse;

import java.util.List;

public interface SupplierProcurementOrderService {
    SupplierProcurementOrderResponse create(SupplierProcurementOrderRequest request);
    SupplierProcurementOrderResponse getById(Integer id);
    List<SupplierProcurementOrderResponse> getAll();
    SupplierProcurementOrderResponse update(Integer id, SupplierProcurementOrderRequest request);
    void delete(Integer id);
}