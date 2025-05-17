package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.OrderReturn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReturnRepository extends JpaRepository<OrderReturn, Integer> {
}