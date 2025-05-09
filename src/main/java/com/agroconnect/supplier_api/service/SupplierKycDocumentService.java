package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.SupplierKycDocumentRequest;
import com.agroconnect.supplier_api.dto.SupplierKycDocumentResponse;

import java.util.List;

public interface SupplierKycDocumentService {
    SupplierKycDocumentResponse create(SupplierKycDocumentRequest request);
    SupplierKycDocumentResponse getById(Integer id);
    List<SupplierKycDocumentResponse> getAll();
    SupplierKycDocumentResponse update(Integer id, SupplierKycDocumentRequest request);
    void delete(Integer id);
}