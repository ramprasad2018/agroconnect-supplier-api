package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.SupplierRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRoleRepository extends JpaRepository<SupplierRole, Integer> {
}