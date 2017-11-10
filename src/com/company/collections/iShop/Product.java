package com.company.collections.iShop;

public class Product {
    int id;
    String title;
    String description;
    int qty;
    double price;

    public Product(int id, String title, int qty, double price) {
        this.id = id;
        this.title = title;
        this.description = null;
        this.qty = qty;
        this.price = price;
    }
}
