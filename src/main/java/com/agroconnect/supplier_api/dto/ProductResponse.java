package com.agroconnect.supplier_api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private Integer id;
    private Integer categoryId;
    private Integer supplierId;
    private String name;
    private String description;
    private String unit;
    private String status;
}