package com.agroconnect.supplier_api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderReturnRequest {
    private Integer orderId;
    private String reason;
    private String status;
}