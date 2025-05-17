package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.SupplierOrderTracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierOrderTrackingRepository extends JpaRepository<SupplierOrderTracking, Integer> {
}