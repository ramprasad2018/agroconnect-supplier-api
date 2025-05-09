package com.agroconnect.supplier_api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductReorderAlertResponse {
    private Integer id;
    private Integer productId;
    private Integer threshold;
}