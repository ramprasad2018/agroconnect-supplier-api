package com.agroconnect.supplier_api.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryScheduleResponse {
    private Integer id;
    private Integer orderId;
    private LocalDate dispatchDate;
    private String trackingId;
}