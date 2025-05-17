package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.DeliveryScheduleRequest;
import com.agroconnect.supplier_api.dto.DeliveryScheduleResponse;
import com.agroconnect.supplier_api.mapper.DeliveryScheduleMapper;
import com.agroconnect.supplier_api.model.DeliverySchedule;
import com.agroconnect.supplier_api.repository.DeliveryScheduleRepository;
import com.agroconnect.supplier_api.service.DeliveryScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class DeliveryScheduleServiceImpl implements DeliveryScheduleService {

    private final DeliveryScheduleRepository repository;
    private final DeliveryScheduleMapper mapper;

    @Override
    public DeliveryScheduleResponse create(DeliveryScheduleRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public DeliveryScheduleResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));
    }

    @Override
    public List<DeliveryScheduleResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public DeliveryScheduleResponse update(Integer id, DeliveryScheduleRequest request) {
        DeliverySchedule entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));

        entity.setOrderId(request.getOrderId());
        entity.setDispatchDate(request.getDispatchDate());
        entity.setTrackingId(request.getTrackingId());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}