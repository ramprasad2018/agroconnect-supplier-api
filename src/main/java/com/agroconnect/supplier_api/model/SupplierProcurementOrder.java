package com.agroconnect.supplier_api.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "supplier_procurement_order", schema = "supplier")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierProcurementOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    private String status;
}