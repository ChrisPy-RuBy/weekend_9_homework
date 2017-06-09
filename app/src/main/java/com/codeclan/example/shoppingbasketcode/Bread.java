package com.codeclan.example.shoppingbasketcode;

import static android.R.attr.name;

/**
 * Created by mac on 6/9/17.
 */

public class Bread extends Item {

    private double value;

    public Bread (String brand, double value) {
        super(brand, value);
        this.value = value;
    }
}
