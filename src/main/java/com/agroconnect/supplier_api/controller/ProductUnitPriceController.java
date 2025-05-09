package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.ProductUnitPriceRequest;
import com.agroconnect.supplier_api.dto.ProductUnitPriceResponse;
import com.agroconnect.supplier_api.service.ProductUnitPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-unit-prices")
@RequiredArgsConstructor
public class ProductUnitPriceController {

    private final ProductUnitPriceService service;

    @PostMapping
    public ResponseEntity<ProductUnitPriceResponse> create(@RequestBody ProductUnitPriceRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductUnitPriceResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductUnitPriceResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductUnitPriceResponse> update(@PathVariable Integer id, @RequestBody ProductUnitPriceRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}