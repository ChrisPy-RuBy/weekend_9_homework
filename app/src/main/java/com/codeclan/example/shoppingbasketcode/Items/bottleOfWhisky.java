package com.codeclan.example.shoppingbasketcode.Items;

/**
 * Created by mac on 6/11/17.
 */

public class bottleOfWhisky extends Item {

    public bottleOfWhisky(String brand, double value) {
        super(brand, value);
    }

    public String itemType() {
        return "whisky";
    }
}
