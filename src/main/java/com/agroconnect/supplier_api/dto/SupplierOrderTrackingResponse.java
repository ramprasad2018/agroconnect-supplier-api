package com.agroconnect.supplier_api.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierOrderTrackingResponse {
    private Integer id;
    private Integer orderId;
    private String trackingStatus;
    private LocalDateTime updatedAt;
}