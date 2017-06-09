package com.codeclan.example.shoppingbasketcode;

/**
 * Created by mac on 6/9/17.
 */

public class Basket {

    private int basketSize;


    public Basket(int basketSize){
        this.basketSize = basketSize;

    }

    public int numberOfItems() {
        return this.basketSize;
    }
}
