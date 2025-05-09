package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.ProductWarehouseAssignmentRequest;
import com.agroconnect.supplier_api.dto.ProductWarehouseAssignmentResponse;
import com.agroconnect.supplier_api.service.ProductWarehouseAssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-warehouse-assignments")
@RequiredArgsConstructor
public class ProductWarehouseAssignmentController {

    private final ProductWarehouseAssignmentService service;

    @PostMapping
    public ResponseEntity<ProductWarehouseAssignmentResponse> create(@RequestBody ProductWarehouseAssignmentRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductWarehouseAssignmentResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductWarehouseAssignmentResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductWarehouseAssignmentResponse> update(@PathVariable Integer id, @RequestBody ProductWarehouseAssignmentRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}