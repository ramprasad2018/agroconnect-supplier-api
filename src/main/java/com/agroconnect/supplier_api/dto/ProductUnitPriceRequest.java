package com.agroconnect.supplier_api.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductUnitPriceRequest {
    private Integer productId;
    private Double mrp;
    private Double sellingPrice;
    private LocalDate effectiveDate;
}