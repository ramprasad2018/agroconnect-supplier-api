package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.ProductRequest;
import com.agroconnect.supplier_api.dto.ProductResponse;
import com.agroconnect.supplier_api.mapper.ProductMapper;
import com.agroconnect.supplier_api.model.Product;
import com.agroconnect.supplier_api.repository.ProductRepository;
import com.agroconnect.supplier_api.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductResponse create(ProductRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public ProductResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public List<ProductResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public ProductResponse update(Integer id, ProductRequest request) {
        Product entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        entity.setCategoryId(request.getCategoryId());
        entity.setSupplierId(request.getSupplierId());
        entity.setName(request.getName());
        entity.setDescription(request.getDescription());
        entity.setUnit(request.getUnit());
        entity.setStatus(request.getStatus());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}