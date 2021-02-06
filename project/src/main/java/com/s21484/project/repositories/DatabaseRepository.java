package com.s21484.project.repositories;

import com.s21484.project.models.*;

import java.util.ArrayList;

public class DatabaseRepository {

    private final ArrayList<CategoryModel> categories;
    private final ArrayList<OrderModel> orders;

    public DatabaseRepository() {
        var generator = new DatabaseGenerator();
        categories =generator.getCategories();
        orders = generator.getOrders();
    }

    // --- Getters

    public ArrayList<CategoryModel> getCategories() {
        return categories;
    }

    public ArrayList<OrderModel> getOrders() {
        return orders;
    }

    /**
     * @returns object when shop items exist, otherwise null
     */
    public ShopItemModel getShopItemById(int id) {
        for (var category : categories)
            for (var item : category.getItems())
                if (item.getId() == id)
                    return item;
        return null;
    }

    public int getHighestOrderId() {
        var result = orders.get(0).getId();
        for (var order : orders)
            if (order.getId() > result)
                result = order.getId();
        return result;
    }

    // --- Add data

    public void addOrder(OrderModel order) {
        this.orders.add(order);
    }
}