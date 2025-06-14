package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierProcurementItemRequestDto;
import com.agroconnect.supplier_api.dto.SupplierProcurementItemResponseDto;
import com.agroconnect.supplier_api.mapper.SupplierProcurementItemMapper;
import com.agroconnect.supplier_api.model.SupplierProcurementItem;
import com.agroconnect.supplier_api.repository.SupplierProcurementItemRepository;
import com.agroconnect.supplier_api.service.SupplierProcurementItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SupplierProcurementItemServiceImpl implements SupplierProcurementItemService {

    private final SupplierProcurementItemRepository repository;
    private final SupplierProcurementItemMapper mapper;

    @Override
    public SupplierProcurementItemResponseDto create(SupplierProcurementItemRequestDto dto) {
        SupplierProcurementItem item = mapper.toEntity(dto);
        return mapper.toResponseDto(repository.save(item));
    }

    @Override
    public List<SupplierProcurementItemResponseDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public SupplierProcurementItemResponseDto getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponseDto)
                .orElse(null);
    }
}
