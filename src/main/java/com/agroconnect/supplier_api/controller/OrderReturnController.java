package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.OrderReturnRequest;
import com.agroconnect.supplier_api.dto.OrderReturnResponse;
import com.agroconnect.supplier_api.service.OrderReturnService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-returns")
@RequiredArgsConstructor
public class OrderReturnController {

    private final OrderReturnService service;

    @PostMapping
    public ResponseEntity<OrderReturnResponse> create(@RequestBody OrderReturnRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderReturnResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<OrderReturnResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderReturnResponse> update(@PathVariable Integer id, @RequestBody OrderReturnRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}