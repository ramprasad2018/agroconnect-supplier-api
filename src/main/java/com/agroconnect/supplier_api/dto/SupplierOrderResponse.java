package com.agroconnect.supplier_api.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierOrderResponse {
    private Integer id;
    private String buyerId;
    private LocalDateTime orderDate;
    private String status;
}