package com.s21484.project.models;

public class OrderShopItemModel {

    private final int id;
    private final int quantity;
    private final int itemId;

    public OrderShopItemModel(int id, int quantity, int itemId) {
        this.id = id;
        this.quantity = quantity;
        this.itemId = itemId;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getItemId() {
        return itemId;
    }
}
