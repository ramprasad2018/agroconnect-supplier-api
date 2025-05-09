package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.ProductWarehouseAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductWarehouseAssignmentRepository extends JpaRepository<ProductWarehouseAssignment, Integer> {
}