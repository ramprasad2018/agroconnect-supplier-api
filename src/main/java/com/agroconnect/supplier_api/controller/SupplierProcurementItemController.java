package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.SupplierProcurementItemRequestDto;
import com.agroconnect.supplier_api.dto.SupplierProcurementItemResponseDto;
import com.agroconnect.supplier_api.service.SupplierProcurementItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/procurement-items")
@RequiredArgsConstructor
public class SupplierProcurementItemController {

    private final SupplierProcurementItemService service;

    @PostMapping
    public SupplierProcurementItemResponseDto create(@RequestBody SupplierProcurementItemRequestDto dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<SupplierProcurementItemResponseDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public SupplierProcurementItemResponseDto getById(@PathVariable Integer id) {
        return service.getById(id);
    }
}
