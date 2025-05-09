package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.ProductUnitPriceRequest;
import com.agroconnect.supplier_api.dto.ProductUnitPriceResponse;
import com.agroconnect.supplier_api.mapper.ProductUnitPriceMapper;
import com.agroconnect.supplier_api.model.ProductUnitPrice;
import com.agroconnect.supplier_api.repository.ProductUnitPriceRepository;
import com.agroconnect.supplier_api.service.ProductUnitPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductUnitPriceServiceImpl implements ProductUnitPriceService {

    private final ProductUnitPriceRepository repository;
    private final ProductUnitPriceMapper mapper;

    @Override
    public ProductUnitPriceResponse create(ProductUnitPriceRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public ProductUnitPriceResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Price record not found"));
    }

    @Override
    public List<ProductUnitPriceResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public ProductUnitPriceResponse update(Integer id, ProductUnitPriceRequest request) {
        ProductUnitPrice entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Price record not found"));

        entity.setProductId(request.getProductId());
        entity.setMrp(request.getMrp());
        entity.setSellingPrice(request.getSellingPrice());
        entity.setEffectiveDate(request.getEffectiveDate());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}