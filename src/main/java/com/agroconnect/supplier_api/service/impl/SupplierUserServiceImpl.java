package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierUserRequest;
import com.agroconnect.supplier_api.dto.SupplierUserResponse;
import com.agroconnect.supplier_api.mapper.SupplierUserMapper;
import com.agroconnect.supplier_api.model.SupplierUser;
import com.agroconnect.supplier_api.repository.SupplierUserRepository;
import com.agroconnect.supplier_api.service.SupplierUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierUserServiceImpl implements SupplierUserService {

    private final SupplierUserRepository repository;
    private final SupplierUserMapper mapper;

    @Override
    public SupplierUserResponse create(SupplierUserRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public SupplierUserResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<SupplierUserResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public SupplierUserResponse update(Integer id, SupplierUserRequest request) {
        SupplierUser entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        entity.setSupplierId(request.getSupplierId());
        entity.setUsername(request.getUsername());
        entity.setPassword(request.getPassword());
        entity.setRole(request.getRole());
        entity.setActive(request.getActive());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}