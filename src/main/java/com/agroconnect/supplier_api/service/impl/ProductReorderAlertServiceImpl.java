package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.ProductReorderAlertRequest;
import com.agroconnect.supplier_api.dto.ProductReorderAlertResponse;
import com.agroconnect.supplier_api.mapper.ProductReorderAlertMapper;
import com.agroconnect.supplier_api.model.ProductReorderAlert;
import com.agroconnect.supplier_api.repository.ProductReorderAlertRepository;
import com.agroconnect.supplier_api.service.ProductReorderAlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductReorderAlertServiceImpl implements ProductReorderAlertService {

    private final ProductReorderAlertRepository repository;
    private final ProductReorderAlertMapper mapper;

    @Override
    public ProductReorderAlertResponse create(ProductReorderAlertRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public ProductReorderAlertResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Alert not found"));
    }

    @Override
    public List<ProductReorderAlertResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public ProductReorderAlertResponse update(Integer id, ProductReorderAlertRequest request) {
        ProductReorderAlert entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alert not found"));

        entity.setProductId(request.getProductId());
        entity.setThreshold(request.getThreshold());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}