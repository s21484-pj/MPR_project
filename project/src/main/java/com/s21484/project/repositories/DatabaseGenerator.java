package com.s21484.project.repositories;

import com.s21484.project.models.*;

import java.util.ArrayList;

public class DatabaseGenerator {

    public ArrayList<CategoryModel> getCategories() {
        var result = new ArrayList<CategoryModel>();
        feedCategoryJackets(result);
        feedCategoryTshirts(result);
        feedCategoryHoodies(result);
        return result;
    }

    public ArrayList<OrderModel> getOrders() {
        var result = new ArrayList<OrderModel>();
        feedOrder1(result);
        feedOrder2(result);
        feedOrder3(result);
        feedOrder4(result);
        feedOrder5(result);
        feedOrder6(result);
        feedOrder7(result);
        feedOrder8(result);
        feedOrder9(result);
        feedOrder10(result);
        return result;
    }

    private void feedCategoryJackets(ArrayList<CategoryModel> categories) {
        var photo1 = new PhotoModel(1, "nike_kurtka1.jpg");
        var photo2 = new PhotoModel(2, "nike_kurtka2.jpg");
        var itm1 = new ShopItemModel(1, "nike_kurtka", ShopItemType.Jacket, 249, ShopItemSize.S, "red", "Super kurtka", 100);
        var itm2 = new ShopItemModel(2, "nike_kurtka", ShopItemType.Jacket, 249, ShopItemSize.M, "red", "Super kurtka", 44);
        var itm3 = new ShopItemModel(3, "nike_kurtka", ShopItemType.Jacket, 249, ShopItemSize.L, "red", "Super kurtka", 47);
        var itm4 = new ShopItemModel(4, "nike_kurtka", ShopItemType.Jacket, 249, ShopItemSize.XL, "red", "Super kurtka", 78);
        var itm5 = new ShopItemModel(5, "nike_kurtka", ShopItemType.Jacket, 249, ShopItemSize.XXL, "red", "Super kurtka", 87);
        itm1.addPhoto(photo1);
        itm1.addPhoto(photo2);
        itm2.addPhoto(photo1);
        itm2.addPhoto(photo2);
        itm3.addPhoto(photo1);
        itm3.addPhoto(photo2);
        itm4.addPhoto(photo1);
        itm4.addPhoto(photo2);
        itm5.addPhoto(photo1);
        itm5.addPhoto(photo2);
        var cat1 = new CategoryModel(1, "Kurtki");
        cat1.addItem(itm1);
        cat1.addItem(itm2);
        cat1.addItem(itm3);
        cat1.addItem(itm4);
        cat1.addItem(itm5);

        var photo3 = new PhotoModel(3, "nike_kurtkaWOW1.jpg");
        var photo4 = new PhotoModel(4, "nike_kurtkaWOW2.jpg");
        var itm6 = new ShopItemModel(6, "nike_kurtkaWOW", ShopItemType.Jacket, 299, ShopItemSize.S, "blue", "Extra kurtka", 57);
        var itm7 = new ShopItemModel(7, "nike_kurtkaWOW", ShopItemType.Jacket, 299, ShopItemSize.M, "blue", "Extra kurtka", 33);
        var itm8 = new ShopItemModel(8, "nike_kurtkaWOW", ShopItemType.Jacket, 299, ShopItemSize.L, "blue", "Extra kurtka", 22);
        var itm9 = new ShopItemModel(9, "nike_kurtkaWOW", ShopItemType.Jacket, 299, ShopItemSize.XL, "blue", "Extra kurtka", 53);
        var itm10 = new ShopItemModel(10, "nike_kurtkaWOW", ShopItemType.Jacket, 299, ShopItemSize.XXL, "blue", "Extra kurtka", 68);
        itm6.addPhoto(photo3);
        itm6.addPhoto(photo4);
        itm7.addPhoto(photo3);
        itm7.addPhoto(photo4);
        itm8.addPhoto(photo3);
        itm8.addPhoto(photo4);
        itm9.addPhoto(photo3);
        itm9.addPhoto(photo4);
        itm10.addPhoto(photo3);
        itm10.addPhoto(photo4);
        cat1.addItem(itm6);
        cat1.addItem(itm7);
        cat1.addItem(itm8);
        cat1.addItem(itm9);
        cat1.addItem(itm10);

      categories.add(cat1);
    }

    private void feedCategoryTshirts(ArrayList<CategoryModel> categories) {
        var photo5 = new PhotoModel(5, "nike_tshirt1.jpg");
        var photo6 = new PhotoModel(6, "nike_tshirt2.jpg");
        var itm11 = new ShopItemModel(11, "nike_tshirt", ShopItemType.TShirt, 59, ShopItemSize.S, "green", "Super tshirt", 100);
        var itm12 = new ShopItemModel(12, "nike_tshirt", ShopItemType.TShirt, 59, ShopItemSize.M, "green", "Super tshirt", 70);
        var itm13 = new ShopItemModel(13, "nike_tshirt", ShopItemType.TShirt, 59, ShopItemSize.L, "green", "Super tshirt", 50);
        var itm14 = new ShopItemModel(14, "nike_tshirt", ShopItemType.TShirt, 59, ShopItemSize.XL, "green", "Super tshirt", 80);
        var itm15 = new ShopItemModel(15, "nike_tshirt", ShopItemType.TShirt, 59, ShopItemSize.XXL, "green", "Super tshirt", 100);
        itm11.addPhoto(photo5);
        itm11.addPhoto(photo6);
        itm12.addPhoto(photo5);
        itm12.addPhoto(photo6);
        itm13.addPhoto(photo5);
        itm13.addPhoto(photo6);
        itm14.addPhoto(photo5);
        itm14.addPhoto(photo6);
        itm15.addPhoto(photo5);
        itm15.addPhoto(photo6);
        var cat2 = new CategoryModel(2, "tshirty");
        cat2.addItem(itm11);
        cat2.addItem(itm12);
        cat2.addItem(itm13);
        cat2.addItem(itm14);
        cat2.addItem(itm15);

        var photo7 = new PhotoModel(7, "nike_tshirtWOW1.jpg");
        var photo8 = new PhotoModel(8, "nike_tshirtWOW2.jpg");
        var itm16 = new ShopItemModel(16, "nike_tshirtWOW", ShopItemType.TShirt, 79, ShopItemSize.S, "yellow", "Extra tshirt", 50);
        var itm17 = new ShopItemModel(17, "nike_tshirtWOW", ShopItemType.TShirt, 79, ShopItemSize.M, "yellow", "Extra tshirt", 30);
        var itm18 = new ShopItemModel(18, "nike_tshirtWOW", ShopItemType.TShirt, 79, ShopItemSize.L, "yellow", "Extra tshirt", 40);
        var itm19 = new ShopItemModel(19, "nike_tshirtWOW", ShopItemType.TShirt, 79, ShopItemSize.XL, "yellow", "Extra tshirt", 60);
        var itm20 = new ShopItemModel(20, "nike_tshirtWOW", ShopItemType.TShirt, 79, ShopItemSize.XXL, "yellow", "Extra tshirt", 70);
        itm16.addPhoto(photo7);
        itm16.addPhoto(photo8);
        itm17.addPhoto(photo7);
        itm17.addPhoto(photo8);
        itm18.addPhoto(photo7);
        itm18.addPhoto(photo8);
        itm19.addPhoto(photo7);
        itm19.addPhoto(photo8);
        itm20.addPhoto(photo7);
        itm20.addPhoto(photo8);
        cat2.addItem(itm16);
        cat2.addItem(itm17);
        cat2.addItem(itm18);
        cat2.addItem(itm19);
        cat2.addItem(itm20);

        categories.add(cat2);
    }

    private void feedCategoryHoodies(ArrayList<CategoryModel> categories) {
        var photo9 = new PhotoModel(9, "nike_hoodie1.jpg");
        var photo10 = new PhotoModel(10, "nike_hoodie2.jpg");
        var itm21 = new ShopItemModel(21, "nike_hoodie", ShopItemType.Hoodie, 169, ShopItemSize.S, "black", "Super hoodie", 90);
        var itm22 = new ShopItemModel(22, "nike_hoodie", ShopItemType.Hoodie, 169, ShopItemSize.M, "black", "Super hoodie", 90);
        var itm23 = new ShopItemModel(23, "nike_hoodie", ShopItemType.Hoodie, 169, ShopItemSize.L, "black", "Super hoodie", 100);
        var itm24 = new ShopItemModel(24, "nike_hoodie", ShopItemType.Hoodie, 169, ShopItemSize.XL, "black", "Super hoodie", 90);
        var itm25 = new ShopItemModel(25, "nike_hoodie", ShopItemType.Hoodie, 169, ShopItemSize.XXL, "black", "Super hoodie", 50);
        itm21.addPhoto(photo9);
        itm21.addPhoto(photo10);
        itm22.addPhoto(photo9);
        itm22.addPhoto(photo10);
        itm23.addPhoto(photo9);
        itm23.addPhoto(photo10);
        itm24.addPhoto(photo9);
        itm24.addPhoto(photo10);
        itm25.addPhoto(photo9);
        itm25.addPhoto(photo10);
        var cat3 = new CategoryModel(3, "bluzy");
        cat3.addItem(itm21);
        cat3.addItem(itm22);
        cat3.addItem(itm23);
        cat3.addItem(itm24);
        cat3.addItem(itm25);

        var photo11 = new PhotoModel(11, "nike_hoodieWOW1.jpg");
        var photo12 = new PhotoModel(12, "nike_hoodieWOW2.jpg");
        var itm26 = new ShopItemModel(26, "nike_hoodieWOW", ShopItemType.Hoodie, 199, ShopItemSize.S, "white", "Extra hoodie", 90);
        var itm27 = new ShopItemModel(27, "nike_hoodieWOW", ShopItemType.Hoodie, 199, ShopItemSize.M, "white", "Extra hoodie", 90);
        var itm28 = new ShopItemModel(28, "nike_hoodieWOW", ShopItemType.Hoodie, 199, ShopItemSize.L, "white", "Extra hoodie", 100);
        var itm29 = new ShopItemModel(29, "nike_hoodieWOW", ShopItemType.Hoodie, 199, ShopItemSize.XL, "white", "Extra hoodie", 90);
        var itm30 = new ShopItemModel(30, "nike_hoodieWOW", ShopItemType.Hoodie, 199, ShopItemSize.XXL, "white", "Extra hoodie", 50);
        itm26.addPhoto(photo11);
        itm26.addPhoto(photo12);
        itm27.addPhoto(photo11);
        itm27.addPhoto(photo12);
        itm28.addPhoto(photo11);
        itm28.addPhoto(photo12);
        itm29.addPhoto(photo11);
        itm29.addPhoto(photo12);
        itm30.addPhoto(photo11);
        itm30.addPhoto(photo12);
        cat3.addItem(itm26);
        cat3.addItem(itm27);
        cat3.addItem(itm28);
        cat3.addItem(itm29);
        cat3.addItem(itm30);

       categories.add(cat3);
    }

    private void feedOrder1(ArrayList<OrderModel> orders) {
        var cus1 = new CustomerModel(1, "Waldemar", "Kozlowski", "+48111222333", "funny@email.com", "ul. Slowianska 21, 82-500 Kwidzyn");
        var order1 = new OrderModel(1, cus1, "2021-02-04 14:43:00");
        var orderItem1 = new OrderShopItemModel(1, 5, 1);
        order1.addOrderItem(orderItem1);
        order1.setCost(1245);
        orders.add(order1);
    }

    private void feedOrder2(ArrayList<OrderModel> orders) {
        var cus2 = new CustomerModel(2, "Jan", "Nowak", "+48 222333444", "happy@gmail.com", "ul.Kwiatowa 11, 33-333 Krakow");
        var order2 = new OrderModel(2, cus2, "2021-02-04 15:20:00");
        var orderItem2 = new OrderShopItemModel(2, 1, 3);
        order2.addOrderItem(orderItem2);
        order2.setCost(249);
        orders.add(order2);
    }

    private void feedOrder3(ArrayList<OrderModel> orders) {
        var cus3 = new CustomerModel(3, "Andrzej", "Kowalski", "+48 333333444", "sad@gmail.com", "ul.Miodowa 8, 50-503 Warszawa");
        var order3 = new OrderModel(3, cus3, "2021-02-04 17:20:00");
        var orderItem3 = new OrderShopItemModel(3, 10, 5);
        order3.addOrderItem(orderItem3);
        order3.setCost(2490);
        orders.add(order3);
    }

    private void feedOrder4(ArrayList<OrderModel> orders) {
        var cus4 = new CustomerModel(4, "Jan", "Brzechwa", "+48 666333444", "brzechwa@gmail.com", "ul.Awendowa 16, 38-366 Szczecin");
        var order4 = new OrderModel(4, cus4, "2021-02-04 18:20:00");
        var orderItem4 = new OrderShopItemModel(4, 10, 8);
        order4.addOrderItem(orderItem4);
        order4.setCost(2990);
        orders.add(order4);
    }

    private void feedOrder5(ArrayList<OrderModel> orders) {
        var cus5 = new CustomerModel(5, "Marian", "Kolodziej", "+48 666888444", "kolodziej@gmail.com", "ul.Morska 16, 66-666 Kolobrzeg");
        var order5 = new OrderModel(5, cus5, "2021-02-04 19:20:00");
        var orderItem5 = new OrderShopItemModel(5, 2, 11);
        order5.addOrderItem(orderItem5);
        order5.setCost(118);
        orders.add(order5);
    }

    private void feedOrder6(ArrayList<OrderModel> orders) {
        var cus6 = new CustomerModel(6, "Tomasz", "Pajak", "+48 666333999", "pajak@gmail.com", "ul.Lukrecjowa 16, 55-444 Koszalin");
        var order6 = new OrderModel(6, cus6, "2021-02-04 20:20:00");
        var orderItem6 = new OrderShopItemModel(6, 3, 14);
        order6.addOrderItem(orderItem6);
        order6.setCost(177);
        orders.add(order6);
    }

    private void feedOrder7(ArrayList<OrderModel> orders) {
        var cus7 = new CustomerModel(7, "Mariusz", "Lewandowski", "+48 666335599", "lewandowski@gmail.com", "ul.Malopolska 44, 52-434 Gdynia");
        var order7 = new OrderModel(7, cus7, "2021-02-04 21:20:00");
        var orderItem7 = new OrderShopItemModel(7, 1, 17);
        order7.addOrderItem(orderItem7);
        order7.setCost(79);
        orders.add(order7);
    }

    private void feedOrder8(ArrayList<OrderModel> orders) {
        var cus8 = new CustomerModel(8, "Arkadiusz", "Kwasniak", "+48 776335599", "kwasniak@gmail.com", "ul.Kwasna 14, 12-121 Gdansk");
        var order8 = new OrderModel(8, cus8, "2021-02-04 22:20:00");
        var orderItem8 = new OrderShopItemModel(8, 5, 20);
        order8.addOrderItem(orderItem8);
        order8.setCost(395);
        orders.add(order8);
    }

    private void feedOrder9(ArrayList<OrderModel> orders) {
        var cus9 = new CustomerModel(9, "Maciek", "Topolski", "+48 776338599", "topolski@gmail.com", "ul.Topolowa 13, 77-777 Sopot");
        var order9 = new OrderModel(9, cus9, "2021-02-04 23:20:00");
        var orderItem9 = new OrderShopItemModel(9, 1, 23);
        order9.addOrderItem(orderItem9);
        order9.setCost(169);
        orders.add(order9);
    }

    private void feedOrder10(ArrayList<OrderModel> orders) {
        var cus10 = new CustomerModel(10, "Arkadiusz", "Milik", "+48 766655599", "milik@gmail.com", "ul.Starowiejska 5, 05-505 Torun");
        var order10 = new OrderModel(10, cus10, "2021-02-04 22:55:00");
        var orderItem10 = new OrderShopItemModel(10, 2, 24);
        order10.addOrderItem(orderItem10);
        order10.setCost(368);
        orders.add(order10);
    }
}