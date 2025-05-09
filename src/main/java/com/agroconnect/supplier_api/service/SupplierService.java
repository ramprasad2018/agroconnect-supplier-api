package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierRequest;
import com.agroconnect.supplier_api.dto.SupplierResponse;

import java.util.List;

public interface SupplierService {
    SupplierResponse create(SupplierRequest request);
    SupplierResponse getById(Integer id);
    List<SupplierResponse> getAll();
    SupplierResponse update(Integer id, SupplierRequest request);
    void delete(Integer id);
}