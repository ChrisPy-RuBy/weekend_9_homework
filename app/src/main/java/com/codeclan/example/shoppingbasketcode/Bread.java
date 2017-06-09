package com.codeclan.example.shoppingbasketcode;

import static android.R.attr.name;

/**
 * Created by mac on 6/9/17.
 */

public class Bread extends Item {

    private String brand;
    private double value;

    public Bread (String brand) {
        this.brand = brand;
        this.value = 1.23;

    }

    public String getBrand() {
        return brand;
    }

    public double checkValue() {
        return value;
    }
}
