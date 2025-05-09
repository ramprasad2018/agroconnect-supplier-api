package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierRequest;
import com.agroconnect.supplier_api.dto.SupplierResponse;
import com.agroconnect.supplier_api.mapper.SupplierMapper;
import com.agroconnect.supplier_api.model.Supplier;
import com.agroconnect.supplier_api.repository.SupplierRepository;
import com.agroconnect.supplier_api.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository repository;
    private final SupplierMapper mapper;

    @Override
    public SupplierResponse create(SupplierRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public SupplierResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Supplier not found"));
    }

    @Override
    public List<SupplierResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public SupplierResponse update(Integer id, SupplierRequest request) {
        Supplier entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Supplier not found"));

        entity.setName(request.getName());
        entity.setGstNumber(request.getGstNumber());
        entity.setContact(request.getContact());
        entity.setAddress(request.getAddress());
        entity.setRegistrationDate(request.getRegistrationDate());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}