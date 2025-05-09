package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierRoleRequest;
import com.agroconnect.supplier_api.dto.SupplierRoleResponse;
import com.agroconnect.supplier_api.mapper.SupplierRoleMapper;
import com.agroconnect.supplier_api.model.SupplierRole;
import com.agroconnect.supplier_api.repository.SupplierRoleRepository;
import com.agroconnect.supplier_api.service.SupplierRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierRoleServiceImpl implements SupplierRoleService {

    private final SupplierRoleRepository repository;
    private final SupplierRoleMapper mapper;

    @Override
    public SupplierRoleResponse create(SupplierRoleRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public SupplierRoleResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }

    @Override
    public List<SupplierRoleResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public SupplierRoleResponse update(Integer id, SupplierRoleRequest request) {
        SupplierRole entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        entity.setRoleName(request.getRoleName());
        entity.setDescription(request.getDescription());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}