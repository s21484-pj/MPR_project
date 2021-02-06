package com.s21484.project.dtos;

import com.s21484.project.models.CustomerModel;
import com.s21484.project.models.OrderShopItemModel;

import java.util.ArrayList;

public class BuyDto {
    public CustomerModel customer;
    public ArrayList<OrderShopItemModel> orderItems;
}
