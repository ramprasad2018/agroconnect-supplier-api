package com.agroconnect.supplier_api.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class SupplierProcurementItemResponseDto {
    private Integer id;
    private Integer procurementOrderId;
    private String productName;
    private Integer quantity;
    private LocalDate expectedDelivery;
}
