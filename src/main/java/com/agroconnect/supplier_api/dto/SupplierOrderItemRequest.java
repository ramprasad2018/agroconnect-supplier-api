package com.agroconnect.supplier_api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierOrderItemRequest {
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
    private Double pricePerUnit;
}