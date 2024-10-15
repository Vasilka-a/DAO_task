package com.example.dao_task.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String product_name;
    @Column(nullable = false)
    private long amount;
    @ManyToOne
    @JoinColumn(name = "costumers_id", referencedColumnName = "id")
    private Customers customers;
}
