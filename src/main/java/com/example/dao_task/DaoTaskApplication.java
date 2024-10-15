package com.example.dao_task;

import com.example.dao_task.entity.Customers;
import com.example.dao_task.entity.Orders;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DaoTaskApplication implements CommandLineRunner {
    @PersistenceContext
    private EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication.run(DaoTaskApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        LocalDate currentDate = LocalDate.now();
        Customers customers1 = Customers.builder().name("Anna").surname("Ivanova").age(22)
                .phone_number("8999-777-77-77").build();
        Orders orders1 = Orders.builder().date(String.valueOf(currentDate))
                .product_name("Jeans").amount(12000).customers(customers1).build();
        Orders orders2 = Orders.builder().date(String.valueOf(currentDate))
                .product_name("Boots").amount(19000).customers(customers1).build();
        entityManager.persist(customers1);
        entityManager.persist(orders1);
        entityManager.persist(orders2);

        Customers customers2 = Customers.builder().name("Olga").surname("Smirnova").age(26)
                .phone_number("8999-777-77-77").build();
        Orders orders3 = Orders.builder().date(String.valueOf(currentDate))
                .product_name("Dress").amount(9000).customers(customers2).build();

        entityManager.persist(customers2);
        entityManager.persist(orders3);

        Customers customers3 = Customers.builder().name("Ivan").surname("Sobolev").age(34)
                .phone_number("8999-777-77-77").build();
        Orders orders4 = Orders.builder().date(String.valueOf(currentDate))
                .product_name("Jacket").amount(13000).customers(customers3).build();
        Orders orders5 = Orders.builder().date(String.valueOf(currentDate))
                .product_name("Boots").amount(19000).customers(customers3).build();

        entityManager.persist(customers3);
        entityManager.persist(orders4);
        entityManager.persist(orders5);
    }
}
