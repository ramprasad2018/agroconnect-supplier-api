package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.SupplierKycDocumentRequest;
import com.agroconnect.supplier_api.dto.SupplierKycDocumentResponse;
import com.agroconnect.supplier_api.mapper.SupplierKycDocumentMapper;
import com.agroconnect.supplier_api.model.SupplierKycDocument;
import com.agroconnect.supplier_api.repository.SupplierKycDocumentRepository;
import com.agroconnect.supplier_api.service.SupplierKycDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierKycDocumentServiceImpl implements SupplierKycDocumentService {

    private final SupplierKycDocumentRepository repository;
    private final SupplierKycDocumentMapper mapper;

    @Override
    public SupplierKycDocumentResponse create(SupplierKycDocumentRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public SupplierKycDocumentResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Document not found"));
    }

    @Override
    public List<SupplierKycDocumentResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public SupplierKycDocumentResponse update(Integer id, SupplierKycDocumentRequest request) {
        SupplierKycDocument entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Document not found"));

        entity.setSupplierId(request.getSupplierId());
        entity.setDocumentType(request.getDocumentType());
        entity.setFilePath(request.getFilePath());
        entity.setUploadedAt(request.getUploadedAt());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}