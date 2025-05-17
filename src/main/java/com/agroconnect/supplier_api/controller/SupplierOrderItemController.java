package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.SupplierOrderItemRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderItemResponse;
import com.agroconnect.supplier_api.service.SupplierOrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier-order-items")
@RequiredArgsConstructor
public class SupplierOrderItemController {

    private final SupplierOrderItemService service;

    @PostMapping
    public ResponseEntity<SupplierOrderItemResponse> create(@RequestBody SupplierOrderItemRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierOrderItemResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<SupplierOrderItemResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplierOrderItemResponse> update(@PathVariable Integer id, @RequestBody SupplierOrderItemRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}