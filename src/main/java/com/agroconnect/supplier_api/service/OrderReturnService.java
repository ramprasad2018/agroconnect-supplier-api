package com.agroconnect.supplier_api.service;

import com.agroconnect.supplier_api.dto.OrderReturnRequest;
import com.agroconnect.supplier_api.dto.OrderReturnResponse;

import java.util.List;

public interface OrderReturnService {
    OrderReturnResponse create(OrderReturnRequest request);
    OrderReturnResponse getById(Integer id);
    List<OrderReturnResponse> getAll();
    OrderReturnResponse update(Integer id, OrderReturnRequest request);
    void delete(Integer id);
}