package com.agroconnect.supplier_api.repository;

import com.agroconnect.supplier_api.model.DeliverySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryScheduleRepository extends JpaRepository<DeliverySchedule, Integer> {
}