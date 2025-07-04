package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.SupplierProcurementOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierProcurementOrderRepository extends JpaRepository<SupplierProcurementOrder, Integer> {
}