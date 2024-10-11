package com.example.dao_task.controller;

import com.example.dao_task.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    public OrdersService ordersService;

    public Controller(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam(value = "name") String name) {
        return ordersService.getProductName(name);
    }
}
