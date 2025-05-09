package com.agroconnect.supplier_api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierUserRequest {
    private Integer supplierId;
    private String username;
    private String password;
    private String role;
    private Boolean active;
}