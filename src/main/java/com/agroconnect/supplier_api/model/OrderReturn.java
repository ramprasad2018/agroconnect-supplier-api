package com.agroconnect.supplier_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_return", schema = "supplier")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderReturn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    private String reason;
    private String status;
}