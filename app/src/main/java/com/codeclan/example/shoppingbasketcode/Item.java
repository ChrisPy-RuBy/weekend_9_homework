package com.codeclan.example.shoppingbasketcode;

/**
 * Created by mac on 6/9/17.
 */

public class Item implements Buyable {

    private double value;

    public Item() {
        this.value = 1.23;
    }

    public double checkValue() {
        return value;
    }
}
