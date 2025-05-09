package com.agroconnect.supplier_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "supplier_role", schema = "supplier")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_name", unique = true, nullable = false)
    private String roleName;

    private String description;
}