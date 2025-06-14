package com.agroconnect.supplier_api.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierProcurementOrderResponse {
    private Integer id;
    private String vendorName;
    private LocalDateTime orderDate;
    private String status;
}