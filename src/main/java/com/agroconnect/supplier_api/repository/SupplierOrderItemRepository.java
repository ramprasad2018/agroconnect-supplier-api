package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.SupplierOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierOrderItemRepository extends JpaRepository<SupplierOrderItem, Integer> {
}