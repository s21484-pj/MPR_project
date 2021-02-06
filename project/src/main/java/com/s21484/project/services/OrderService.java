package com.s21484.project.services;

import com.s21484.project.dtos.BuyDto;
import com.s21484.project.models.CategoryModel;
import com.s21484.project.models.OrderModel;
import com.s21484.project.models.OrderShopItemModel;
import com.s21484.project.repositories.DatabaseRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class OrderService {

    private final DatabaseRepository databaseRepository;

    public OrderService(DatabaseRepository dbRepo) {
        databaseRepository = dbRepo;
    }

    // --- Getters

    public ArrayList<CategoryModel> getCategories() {
        return databaseRepository.getCategories();
    }

    public ArrayList<OrderModel> getOrders() {
        return databaseRepository.getOrders();
    }

    // --- Logic

    public OrderModel createOrder(BuyDto payload) {
        var currentHighestOrderId = databaseRepository.getHighestOrderId();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        var order = new OrderModel(currentHighestOrderId + 1, payload.customer, formatter.format(date));
        for (var item : payload.orderItems)
            order.addOrderItem(item);
        var discount = getDiscount(order.getItems());
        var cost = getTotalCost(order.getItems(), discount);
        order.setCost(cost);
        return order;
    }

    public void addOrderToDb(OrderModel order) {
        databaseRepository.addOrder(order);
    }

    public boolean areAllOrderItemsExistInDatabase(ArrayList<OrderShopItemModel> items) {
        for (var orderItem : items)
            if (databaseRepository.getShopItemById(orderItem.getItemId()) == null)
                return false;
        return true;
    }

    public double getTotalCost(ArrayList<OrderShopItemModel> items, int discount) {
        var totalPrice = 0;
        for (var item : items){
            var dbItem = databaseRepository.getShopItemById(item.getId());
            totalPrice += dbItem.getPrice();
        }
        var result = totalPrice * ((100-(double)discount)/100);
        return Math.round(result * 100.0) / 100.0; // round up to 2 decimal places
    }

    public int getDiscount(ArrayList<OrderShopItemModel> items) {
        var discount = items.size() * 5;
        if (discount > 30) return 30;
        else return discount;
    }
}
