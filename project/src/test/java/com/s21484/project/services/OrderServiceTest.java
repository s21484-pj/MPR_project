package com.s21484.project.services;

import com.s21484.project.models.OrderShopItemModel;
import com.s21484.project.repositories.DatabaseRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    private final OrderService service;

    public OrderServiceTest() {
        var dbRepo = new DatabaseRepository();
        service = new OrderService(dbRepo);
    }

    @Test
    void getTotalCost1() {
        var items = new ArrayList<OrderShopItemModel>();
        var discount = 30;
        items.add(new OrderShopItemModel(1, 1, 26)); // Price for id 26 is 249
        var cost = service.getTotalCost(items, discount);
        assertThat(cost).isEqualTo(174.3);
    }

    @Test
    void getDiscount() {
        var items = new ArrayList<OrderShopItemModel>();
        items.add(new OrderShopItemModel(1, 1, 1)); // Every item is 5 percent discount, max is 30
        items.add(new OrderShopItemModel(2, 1, 8));
        items.add(new OrderShopItemModel(3, 1, 14));
        var discount = service.getDiscount(items);
        assertThat(discount).isEqualTo(15);
    }
}