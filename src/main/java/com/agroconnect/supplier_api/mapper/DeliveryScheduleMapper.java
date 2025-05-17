package com.agroconnect.supplier_api.mapper;

import com.agroconnect.supplier_api.dto.DeliveryScheduleRequest;
import com.agroconnect.supplier_api.dto.DeliveryScheduleResponse;
import com.agroconnect.supplier_api.model.DeliverySchedule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DeliveryScheduleMapper {
    DeliverySchedule toEntity(DeliveryScheduleRequest request);
    DeliveryScheduleResponse toResponse(DeliverySchedule entity);
}