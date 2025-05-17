package com.agroconnect.supplier_api.service.impl;

import com.agroconnect.supplier_api.dto.OrderReturnRequest;
import com.agroconnect.supplier_api.dto.OrderReturnResponse;
import com.agroconnect.supplier_api.mapper.OrderReturnMapper;
import com.agroconnect.supplier_api.model.OrderReturn;
import com.agroconnect.supplier_api.repository.OrderReturnRepository;
import com.agroconnect.supplier_api.service.OrderReturnService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderReturnServiceImpl implements OrderReturnService {

    private final OrderReturnRepository repository;
    private final OrderReturnMapper mapper;

    @Override
    public OrderReturnResponse create(OrderReturnRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public OrderReturnResponse getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Order return not found"));
    }

    @Override
    public List<OrderReturnResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public OrderReturnResponse update(Integer id, OrderReturnRequest request) {
        OrderReturn entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order return not found"));

        entity.setOrderId(request.getOrderId());
        entity.setReason(request.getReason());
        entity.setStatus(request.getStatus());

        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}