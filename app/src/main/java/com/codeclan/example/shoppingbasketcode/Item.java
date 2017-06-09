package com.codeclan.example.shoppingbasketcode;

/**
 * Created by mac on 6/9/17.
 */

public abstract class Item implements Buyable {

    double value;
    String brand;

    public Item(String brand, double value) {
        this.value = value;
        this.brand = brand;
    }

    public double checkValue() {
        return value;
    }

    public String getBrand() {
        return brand;
    }

}
