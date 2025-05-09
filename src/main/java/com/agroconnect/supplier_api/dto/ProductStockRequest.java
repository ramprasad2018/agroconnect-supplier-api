package com.agroconnect.supplier_api.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductStockRequest {
    private Integer productId;
    private Integer quantity;
    private LocalDateTime lastUpdated;
}