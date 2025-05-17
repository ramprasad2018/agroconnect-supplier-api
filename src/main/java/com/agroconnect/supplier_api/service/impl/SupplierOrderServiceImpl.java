package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierOrderRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderResponse;
import com.agroconnect.supplier_api.mapper.SupplierOrderMapper;
import com.agroconnect.supplier_api.model.SupplierOrder;
import com.agroconnect.supplier_api.repository.SupplierOrderRepository;
import com.agroconnect.supplier_api.service.SupplierOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierOrderServiceImpl implements SupplierOrderService {

    private final SupplierOrderRepository repository;
    private final SupplierOrderMapper mapper;

    @Override
    public SupplierOrderResponse create(SupplierOrderRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public SupplierOrderResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public List<SupplierOrderResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public SupplierOrderResponse update(Integer id, SupplierOrderRequest request) {
        SupplierOrder entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        entity.setBuyerId(request.getBuyerId());
        entity.setOrderDate(request.getOrderDate());
        entity.setStatus(request.getStatus());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}