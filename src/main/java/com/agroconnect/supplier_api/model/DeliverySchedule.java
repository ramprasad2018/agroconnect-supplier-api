package com.agroconnect.supplier_api.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "delivery_schedule", schema = "supplier")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliverySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "dispatch_date")
    private LocalDate dispatchDate;

    @Column(name = "tracking_id")
    private String trackingId;
}