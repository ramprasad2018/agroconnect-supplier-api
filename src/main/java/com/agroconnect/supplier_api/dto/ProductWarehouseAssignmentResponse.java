package com.agroconnect.supplier_api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductWarehouseAssignmentResponse {
    private Integer id;
    private Integer productId;
    private Integer warehouseId;
    private Integer assignedQuantity;
}