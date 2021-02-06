package com.s21484.project.models;

import java.util.ArrayList;

public class OrderModel {

    private final int id;
    private final CustomerModel customerModel;
    private final ArrayList<OrderShopItemModel> items;
    private final String date;
    private double cost ;

    public double getCost() {
        return cost;
    }

    public OrderModel(int id, CustomerModel customerModel, String date ) {
        this.id = id;
        this.customerModel = customerModel;
        this.date = date;
        items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public CustomerModel getCustomerModel() {
        return customerModel;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<OrderShopItemModel> getItems() {
        return items;
    }

    public ArrayList<OrderShopItemModel> addOrderItem(OrderShopItemModel item) {
        items.add(item);
        return items;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
