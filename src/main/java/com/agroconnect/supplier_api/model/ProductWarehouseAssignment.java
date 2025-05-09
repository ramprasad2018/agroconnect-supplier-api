package com.agroconnect.supplier_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_warehouse_assignment", schema = "supplier")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductWarehouseAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "warehouse_id")
    private Integer warehouseId;

    @Column(name = "assigned_quantity")
    private Integer assignedQuantity;
}