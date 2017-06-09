package com.codeclan.example.shoppingbasketcode;

import java.util.ArrayList;

/**
 * Created by mac on 6/9/17.
 */

public class Basket {

    private ArrayList<Item> basket = new ArrayList<Item>();


    public Basket(){


    }

    public int numberOfItems() {
        return basket.size();
    }

    public void addItem(Item item) {
        basket.add(item);
    }

    public void removeItem(Item item) {
        basket.remove(item);
    }
//
    public void clearItem() {
        basket.clear();
    }

    public int checkTotalValue() {
        int totalValue = 0;
                for (Item item : basket) {
                    totalValue += item.checkValue();
                }
        return totalValue;
    }
}
