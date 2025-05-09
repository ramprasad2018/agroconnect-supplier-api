package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.SupplierUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierUserRepository extends JpaRepository<SupplierUser, Integer> {
}