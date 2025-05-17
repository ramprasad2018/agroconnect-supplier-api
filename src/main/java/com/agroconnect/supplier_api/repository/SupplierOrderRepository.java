package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.SupplierOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierOrderRepository extends JpaRepository<SupplierOrder, Integer> {
}