package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.ProductStockRequest;
import com.agroconnect.supplier_api.dto.ProductStockResponse;
import com.agroconnect.supplier_api.service.ProductStockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-stocks")
@RequiredArgsConstructor
public class ProductStockController {

    private final ProductStockService service;

    @PostMapping
    public ResponseEntity<ProductStockResponse> create(@RequestBody ProductStockRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductStockResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductStockResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductStockResponse> update(@PathVariable Integer id, @RequestBody ProductStockRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}