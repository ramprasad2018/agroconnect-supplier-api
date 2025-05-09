package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.SupplierKycDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierKycDocumentRepository extends JpaRepository<SupplierKycDocument, Integer> {
}