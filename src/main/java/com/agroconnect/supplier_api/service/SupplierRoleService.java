package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierRoleRequest;
import com.agroconnect.supplier_api.dto.SupplierRoleResponse;

import java.util.List;

public interface SupplierRoleService {
    SupplierRoleResponse create(SupplierRoleRequest request);
    SupplierRoleResponse getById(Integer id);
    List<SupplierRoleResponse> getAll();
    SupplierRoleResponse update(Integer id, SupplierRoleRequest request);
    void delete(Integer id);
}