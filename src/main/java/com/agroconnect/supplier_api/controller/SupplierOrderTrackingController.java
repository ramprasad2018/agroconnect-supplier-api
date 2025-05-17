package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.SupplierOrderTrackingRequest;
import com.agroconnect.supplier_api.dto.SupplierOrderTrackingResponse;
import com.agroconnect.supplier_api.service.SupplierOrderTrackingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier-order-tracking")
@RequiredArgsConstructor
public class SupplierOrderTrackingController {

    private final SupplierOrderTrackingService service;

    @PostMapping
    public ResponseEntity<SupplierOrderTrackingResponse> create(@RequestBody SupplierOrderTrackingRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierOrderTrackingResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<SupplierOrderTrackingResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplierOrderTrackingResponse> update(@PathVariable Integer id, @RequestBody SupplierOrderTrackingRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}