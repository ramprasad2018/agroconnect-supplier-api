package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierOrderTrackingRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderTrackingResponse;
import com.agroconnect.supplier_api.mapper.SupplierOrderTrackingMapper;
import com.agroconnect.supplier_api.model.SupplierOrderTracking;
import com.agroconnect.supplier_api.repository.SupplierOrderTrackingRepository;
import com.agroconnect.supplier_api.service.SupplierOrderTrackingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierOrderTrackingServiceImpl implements SupplierOrderTrackingService {

    private final SupplierOrderTrackingRepository repository;
    private final SupplierOrderTrackingMapper mapper;

    @Override
    public SupplierOrderTrackingResponse create(SupplierOrderTrackingRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public SupplierOrderTrackingResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Tracking record not found"));
    }

    @Override
    public List<SupplierOrderTrackingResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public SupplierOrderTrackingResponse update(Integer id, SupplierOrderTrackingRequest request) {
        SupplierOrderTracking entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tracking record not found"));

        entity.setOrderId(request.getOrderId());
        entity.setTrackingStatus(request.getTrackingStatus());
        entity.setUpdatedAt(request.getUpdatedAt());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}