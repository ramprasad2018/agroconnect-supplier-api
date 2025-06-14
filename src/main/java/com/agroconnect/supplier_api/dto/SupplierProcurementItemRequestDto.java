package com.agroconnect.supplier_api.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class SupplierProcurementItemRequestDto {
    private Integer procurementOrderId;
    private String productName;
    private Integer quantity;
    private LocalDate expectedDelivery;
}
