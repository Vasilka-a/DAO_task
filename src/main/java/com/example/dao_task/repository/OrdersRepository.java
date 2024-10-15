package com.example.dao_task.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Repository
public class OrdersRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        return (List<String>) entityManager.createQuery("SELECT o.product_name FROM Orders o JOIN Customers c ON o.customers.id = c.id WHERE lower(c.name) = lower(:name)")
                .setParameter("name", name)
                .getResultList();
    }
}

