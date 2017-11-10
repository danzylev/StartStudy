package com.company.collections.iShop;
import java.util.ArrayList;
import java.util.Map;

public class Shop {
    double account;
    Map<Product, Number> stock;

    public Shop(double account, Map stock) {
        this.account = account;
        this.stock = stock;
    }
}
