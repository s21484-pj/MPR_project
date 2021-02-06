package com.s21484.project.controllers;

import com.s21484.project.dtos.BuyDto;
import com.s21484.project.models.OrderModel;
import com.s21484.project.repositories.DatabaseRepository;
import com.s21484.project.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
public class OrderController {

    @Resource(name = "dbRepo")
    private DatabaseRepository repository;

    @GetMapping("/order/all")
    public ArrayList<OrderModel> getOrders() {
        return repository.getOrders();
    }

    @PostMapping("/order/buy")
    public OrderModel buy(@RequestBody BuyDto payload) {
        var orderService = new OrderService(repository);
        var allOrderItemsExistInDb = orderService.areAllOrderItemsExistInDatabase(payload.orderItems);
        if(!allOrderItemsExistInDb)
            return null; // no created
        var order = orderService.createOrder(payload);
        orderService.addOrderToDb(order);
        return order;
    }
}