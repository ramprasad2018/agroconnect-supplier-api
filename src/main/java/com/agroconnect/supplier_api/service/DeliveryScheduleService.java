package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.DeliveryScheduleRequest;
import com.agroconnect.supplier_api.dto.DeliveryScheduleResponse;

import java.util.List;

public interface DeliveryScheduleService {
    DeliveryScheduleResponse create(DeliveryScheduleRequest request);
    DeliveryScheduleResponse getById(Integer id);
    List<DeliveryScheduleResponse> getAll();
    DeliveryScheduleResponse update(Integer id, DeliveryScheduleRequest request);
    void delete(Integer id);
}