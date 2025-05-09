package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.ProductReorderAlertRequest;
import com.agroconnect.supplier_api.dto.ProductReorderAlertResponse;
import com.agroconnect.supplier_api.service.ProductReorderAlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-reorder-alerts")
@RequiredArgsConstructor
public class ProductReorderAlertController {

    private final ProductReorderAlertService service;

    @PostMapping
    public ResponseEntity<ProductReorderAlertResponse> create(@RequestBody ProductReorderAlertRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductReorderAlertResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductReorderAlertResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductReorderAlertResponse> update(@PathVariable Integer id, @RequestBody ProductReorderAlertRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}