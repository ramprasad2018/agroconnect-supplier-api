package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.SupplierKycDocumentRequest;
import com.agroconnect.supplier_api.dto.SupplierKycDocumentResponse;
import com.agroconnect.supplier_api.model.SupplierKycDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierKycDocumentMapper {
    SupplierKycDocument toEntity(SupplierKycDocumentRequest request);
    SupplierKycDocumentResponse toResponse(SupplierKycDocument entity);
}