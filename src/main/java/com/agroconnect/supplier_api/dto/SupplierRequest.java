package com.agroconnect.supplier_api.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierRequest {
    private String name;
    private String gstNumber;
    private String contact;
    private String address;
    private LocalDateTime registrationDate;
}