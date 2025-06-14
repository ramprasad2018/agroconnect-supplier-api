package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierProcurementOrderRequest;
import com.agroconnect.supplier_api.dto.SupplierProcurementOrderResponse;
import com.agroconnect.supplier_api.mapper.SupplierProcurementOrderMapper;
import com.agroconnect.supplier_api.model.SupplierProcurementOrder;
import com.agroconnect.supplier_api.repository.SupplierProcurementOrderRepository;
import com.agroconnect.supplier_api.service.SupplierProcurementOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierProcurementOrderServiceImpl implements SupplierProcurementOrderService {

    private final SupplierProcurementOrderRepository repository;
    private final SupplierProcurementOrderMapper mapper;

    @Override
    public SupplierProcurementOrderResponse create(SupplierProcurementOrderRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public SupplierProcurementOrderResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Procurement order not found"));
    }

    @Override
    public List<SupplierProcurementOrderResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public SupplierProcurementOrderResponse update(Integer id, SupplierProcurementOrderRequest request) {
        SupplierProcurementOrder entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Procurement order not found"));

        entity.setVendorName(request.getVendorName());
        entity.setOrderDate(request.getOrderDate());
        entity.setStatus(request.getStatus());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}