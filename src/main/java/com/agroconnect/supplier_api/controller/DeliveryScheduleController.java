package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.DeliveryScheduleRequest;
import com.agroconnect.supplier_api.dto.DeliveryScheduleResponse;
import com.agroconnect.supplier_api.service.DeliveryScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery-schedules")
@RequiredArgsConstructor
public class DeliveryScheduleController {

    private final DeliveryScheduleService service;

    @PostMapping
    public ResponseEntity<DeliveryScheduleResponse> create(@RequestBody DeliveryScheduleRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeliveryScheduleResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<DeliveryScheduleResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<DeliveryScheduleResponse> update(@PathVariable Integer id, @RequestBody DeliveryScheduleRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}