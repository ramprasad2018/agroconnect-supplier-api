package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierOrderItemRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderItemResponse;
import com.agroconnect.supplier_api.mapper.SupplierOrderItemMapper;
import com.agroconnect.supplier_api.model.SupplierOrderItem;
import com.agroconnect.supplier_api.repository.SupplierOrderItemRepository;
import com.agroconnect.supplier_api.service.SupplierOrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierOrderItemServiceImpl implements SupplierOrderItemService {

    private final SupplierOrderItemRepository repository;
    private final SupplierOrderItemMapper mapper;

    @Override
    public SupplierOrderItemResponse create(SupplierOrderItemRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public SupplierOrderItemResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Order item not found"));
    }

    @Override
    public List<SupplierOrderItemResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public SupplierOrderItemResponse update(Integer id, SupplierOrderItemRequest request) {
        SupplierOrderItem entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order item not found"));

        entity.setOrderId(request.getOrderId());
        entity.setProductId(request.getProductId());
        entity.setQuantity(request.getQuantity());
        entity.setPricePerUnit(request.getPricePerUnit());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}