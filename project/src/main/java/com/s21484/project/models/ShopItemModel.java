package com.s21484.project.models;

import java.util.ArrayList;

public class ShopItemModel {

    private final int id;
    private final String name;
    private final ShopItemType type;
    private final double price;
    private final ShopItemSize size;
    private final String color;
    private final String description;
    private final int stock;

    private final ArrayList<PhotoModel> photos;

    public ShopItemModel(int id, String name, ShopItemType type,
                         double price, ShopItemSize size, String color,
                         String description, int stock) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.size = size;
        this.color = color;
        this.description = description;
        this.photos = new ArrayList<>();
    }

    public ArrayList<PhotoModel> getPhotos() {
        return photos;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public ShopItemType getType() {
        return this.type;
    }

    public double getPrice() {
        return price;
    }

    public ShopItemSize getSize() {
        return size;
    }

    public int getStock() {
        return stock;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<PhotoModel> addPhoto(PhotoModel item) {
        photos.add(item);
        return photos;
    }

}
