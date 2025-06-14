package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.SupplierProcurementOrderRequest;
import com.agroconnect.supplier_api.dto.SupplierProcurementOrderResponse;
import com.agroconnect.supplier_api.service.SupplierProcurementOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier-procurement-orders")
@RequiredArgsConstructor
public class SupplierProcurementOrderController {

    private final SupplierProcurementOrderService service;

    @PostMapping
    public ResponseEntity<SupplierProcurementOrderResponse> create(@RequestBody SupplierProcurementOrderRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierProcurementOrderResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<SupplierProcurementOrderResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplierProcurementOrderResponse> update(@PathVariable Integer id, @RequestBody SupplierProcurementOrderRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}