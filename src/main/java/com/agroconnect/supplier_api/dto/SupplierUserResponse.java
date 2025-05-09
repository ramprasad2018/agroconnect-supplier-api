package com.agroconnect.supplier_api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierUserResponse {
    private Integer id;
    private Integer supplierId;
    private String username;
    private String role;
    private Boolean active;
}