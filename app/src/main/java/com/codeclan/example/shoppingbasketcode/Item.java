package com.codeclan.example.shoppingbasketcode;

/**
 * Created by mac on 6/9/17.
 */

public abstract class Item implements Buyable {

    private double value;
    private String brand;

    public Item() {
        this.value = 0.00;
        this.brand = brand;
    }

    public double checkValue() {
        return value;
    }

    public String getBrand() {
        return brand;
    }

}
