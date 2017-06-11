package com.codeclan.example.shoppingbasketcode.Items;

/**
 * Created by mac on 6/9/17.
 */

public class Crisps extends Item {

    public Crisps(String brand, double value) {
        super(brand, value);
    }

    public String itemType() {
        return "crisps";
    }

}
