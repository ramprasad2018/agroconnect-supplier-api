package com.agroconnect.supplier_api.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierKycDocumentRequest {
    private Integer supplierId;
    private String documentType;
    private String filePath;
    private LocalDateTime uploadedAt;
}