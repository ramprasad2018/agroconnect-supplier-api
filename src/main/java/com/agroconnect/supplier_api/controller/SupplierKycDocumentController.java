package com.agroconnect.supplier_api.controller;

import com.agroconnect.supplier_api.dto.SupplierKycDocumentRequest;
import com.agroconnect.supplier_api.dto.SupplierKycDocumentResponse;
import com.agroconnect.supplier_api.service.SupplierKycDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier-kyc-documents")
@RequiredArgsConstructor
public class SupplierKycDocumentController {

    private final SupplierKycDocumentService service;

    @PostMapping
    public ResponseEntity<SupplierKycDocumentResponse> create(@RequestBody SupplierKycDocumentRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierKycDocumentResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<SupplierKycDocumentResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplierKycDocumentResponse> update(@PathVariable Integer id, @RequestBody SupplierKycDocumentRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}