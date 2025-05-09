package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierUserRequest;
import com.agroconnect.supplier_api.dto.SupplierUserResponse;

import java.util.List;

public interface SupplierUserService {
    SupplierUserResponse create(SupplierUserRequest request);
    SupplierUserResponse getById(Integer id);
    List<SupplierUserResponse> getAll();
    SupplierUserResponse update(Integer id, SupplierUserRequest request);
    void delete(Integer id);
}