package com.agroconnect.supplier_api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "supplier_procurement_item", schema = "supplier")
public class SupplierProcurementItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "procurement_order_id")
    private Integer procurementOrderId;

    @Column(name = "product_name")
    private String productName;

    private Integer quantity;

    @Column(name = "expected_delivery")
    private LocalDate expectedDelivery;
}
