package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierOrderTrackingRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderTrackingResponse;

import java.util.List;

public interface SupplierOrderTrackingService {
    SupplierOrderTrackingResponse create(SupplierOrderTrackingRequest request);
    SupplierOrderTrackingResponse getById(Integer id);
    List<SupplierOrderTrackingResponse> getAll();
    SupplierOrderTrackingResponse update(Integer id, SupplierOrderTrackingRequest request);
    void delete(Integer id);
}