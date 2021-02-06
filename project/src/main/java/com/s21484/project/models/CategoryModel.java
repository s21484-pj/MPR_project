package com.s21484.project.models;

import java.util.ArrayList;

public class CategoryModel {

    private final int id;
    private final String name;
    private final ArrayList<ShopItemModel> items;

    public CategoryModel(int id, String name) {
        this.id = id;
        this.name = name;
        items = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<ShopItemModel> addItem(ShopItemModel item) {
        items.add(item);
        return items;
    }

    public ArrayList<ShopItemModel> getItems() {
        return items;
    }

}
