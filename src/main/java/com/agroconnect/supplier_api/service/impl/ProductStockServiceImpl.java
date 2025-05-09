package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.ProductStockRequest;
import com.agroconnect.supplier_api.dto.ProductStockResponse;
import com.agroconnect.supplier_api.mapper.ProductStockMapper;
import com.agroconnect.supplier_api.model.ProductStock;
import com.agroconnect.supplier_api.repository.ProductStockRepository;
import com.agroconnect.supplier_api.service.ProductStockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductStockServiceImpl implements ProductStockService {

    private final ProductStockRepository repository;
    private final ProductStockMapper mapper;

    @Override
    public ProductStockResponse create(ProductStockRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public ProductStockResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Stock record not found"));
    }

    @Override
    public List<ProductStockResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public ProductStockResponse update(Integer id, ProductStockRequest request) {
        ProductStock entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Stock record not found"));

        entity.setProductId(request.getProductId());
        entity.setQuantity(request.getQuantity());
        entity.setLastUpdated(request.getLastUpdated());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}