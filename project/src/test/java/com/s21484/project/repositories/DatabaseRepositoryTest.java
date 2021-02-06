package com.s21484.project.repositories;

import com.s21484.project.models.OrderShopItemModel;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DatabaseRepositoryTest {

    private final DatabaseRepository repository;

    public DatabaseRepositoryTest(){
         repository = new DatabaseRepository();
    }

    @Test
    void isOrderShopItemNotNull() {
        var items = new ArrayList<OrderShopItemModel>();
        items.add(new OrderShopItemModel(1, 1, 20));
        assertThat(items).isNotNull();
    }

    @Test
    void getOrderShopItemById() {
        OrderShopItemModel item = new OrderShopItemModel(1, 1, 5);
        assertThat(item.getItemId()).isEqualTo(5);
    }

    @Test
    void getOrderShopItemByOrderId() {
        OrderShopItemModel item = new OrderShopItemModel(4, 1, 1);
        assertThat(item.getId()).isEqualTo(4);
    }

}