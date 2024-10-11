package com.example.dao_task.service;

import com.example.dao_task.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    private OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<String> getProductName(String name) {
        return ordersRepository.getProductName(name);
    }
}
