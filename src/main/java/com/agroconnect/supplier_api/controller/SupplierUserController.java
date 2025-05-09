package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.SupplierUserRequest;
import com.agroconnect.supplier_api.dto.SupplierUserResponse;
import com.agroconnect.supplier_api.service.SupplierUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier-users")
@RequiredArgsConstructor
public class SupplierUserController {

    private final SupplierUserService service;

    @PostMapping
    public ResponseEntity<SupplierUserResponse> create(@RequestBody SupplierUserRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierUserResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<SupplierUserResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplierUserResponse> update(@PathVariable Integer id, @RequestBody SupplierUserRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}