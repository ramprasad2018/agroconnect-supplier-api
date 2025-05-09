package com.agroconnect.supplier_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "supplier_user", schema = "supplier")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "supplier_id")
    private Integer supplierId;

    @Column(unique = true)
    private String username;

    private String password;
    private String role;

    @Column(columnDefinition = "boolean default true")
    private Boolean active;
}