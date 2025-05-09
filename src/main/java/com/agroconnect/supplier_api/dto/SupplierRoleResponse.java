package com.agroconnect.supplier_api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierRoleResponse {
    private Integer id;
    private String roleName;
    private String description;
}