package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.ProductWarehouseAssignmentRequest;
import com.agroconnect.supplier_api.dto.ProductWarehouseAssignmentResponse;
import com.agroconnect.supplier_api.mapper.ProductWarehouseAssignmentMapper;
import com.agroconnect.supplier_api.model.ProductWarehouseAssignment;
import com.agroconnect.supplier_api.repository.ProductWarehouseAssignmentRepository;
import com.agroconnect.supplier_api.service.ProductWarehouseAssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductWarehouseAssignmentServiceImpl implements ProductWarehouseAssignmentService {

    private final ProductWarehouseAssignmentRepository repository;
    private final ProductWarehouseAssignmentMapper mapper;

    @Override
    public ProductWarehouseAssignmentResponse create(ProductWarehouseAssignmentRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public ProductWarehouseAssignmentResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Assignment not found"));
    }

    @Override
    public List<ProductWarehouseAssignmentResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public ProductWarehouseAssignmentResponse update(Integer id, ProductWarehouseAssignmentRequest request) {
        ProductWarehouseAssignment entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Assignment not found"));

        entity.setProductId(request.getProductId());
        entity.setWarehouseId(request.getWarehouseId());
        entity.setAssignedQuantity(request.getAssignedQuantity());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}