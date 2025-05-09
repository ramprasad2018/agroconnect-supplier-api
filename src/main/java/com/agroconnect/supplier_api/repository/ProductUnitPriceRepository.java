package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.ProductUnitPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductUnitPriceRepository extends JpaRepository<ProductUnitPrice, Integer> {
}