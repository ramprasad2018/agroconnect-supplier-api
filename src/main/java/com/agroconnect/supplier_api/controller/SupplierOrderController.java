package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.SupplierOrderRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderResponse;
import com.agroconnect.supplier_api.service.SupplierOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier-orders")
@RequiredArgsConstructor
public class SupplierOrderController {

    private final SupplierOrderService service;

    @PostMapping
    public ResponseEntity<SupplierOrderResponse> create(@RequestBody SupplierOrderRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierOrderResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<SupplierOrderResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplierOrderResponse> update(@PathVariable Integer id, @RequestBody SupplierOrderRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}