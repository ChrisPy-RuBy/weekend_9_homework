package com.codeclan.example.shoppingbasketcode.Items;

import com.codeclan.example.shoppingbasketcode.Items.Item;

/**
 * Created by mac on 6/9/17.
 */

public class Pop extends Item {



    public Pop(String brand, double value) {
        super(brand, value);
    }

    public String itemType() {
        return "pop";
    }
}