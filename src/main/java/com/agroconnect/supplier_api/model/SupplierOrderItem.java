package com.agroconnect.supplier_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "supplier_order_item", schema = "supplier")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "product_id")
    private Integer productId;

    private Integer quantity;

    @Column(name = "price_per_unit")
    private Double pricePerUnit;
}