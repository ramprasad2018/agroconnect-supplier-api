package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.SupplierRoleRequest;
import com.agroconnect.supplier_api.dto.SupplierRoleResponse;
import com.agroconnect.supplier_api.service.SupplierRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier-roles")
@RequiredArgsConstructor
public class SupplierRoleController {

    private final SupplierRoleService service;

    @PostMapping
    public ResponseEntity<SupplierRoleResponse> create(@RequestBody SupplierRoleRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierRoleResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<SupplierRoleResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplierRoleResponse> update(@PathVariable Integer id, @RequestBody SupplierRoleRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}