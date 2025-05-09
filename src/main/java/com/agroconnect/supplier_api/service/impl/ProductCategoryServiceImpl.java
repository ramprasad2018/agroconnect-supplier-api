package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.ProductCategoryRequest;
import com.agroconnect.supplier_api.dto.ProductCategoryResponse;
import com.agroconnect.supplier_api.mapper.ProductCategoryMapper;
import com.agroconnect.supplier_api.model.ProductCategory;
import com.agroconnect.supplier_api.repository.ProductCategoryRepository;
import com.agroconnect.supplier_api.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepository repository;
    private final ProductCategoryMapper mapper;

    @Override
    public ProductCategoryResponse create(ProductCategoryRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public ProductCategoryResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    @Override
    public List<ProductCategoryResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public ProductCategoryResponse update(Integer id, ProductCategoryRequest request) {
        ProductCategory entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        entity.setName(request.getName());
        entity.setDescription(request.getDescription());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}