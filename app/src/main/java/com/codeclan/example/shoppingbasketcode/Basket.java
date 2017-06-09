package com.codeclan.example.shoppingbasketcode;

import java.util.ArrayList;

/**
 * Created by mac on 6/9/17.
 */

public class Basket {

    private ArrayList<Buyable> basket = new ArrayList<Buyable>();


    public Basket(){


    }

    public int numberOfItems() {
        return basket.size();
    }

    public void addItem(Buyable item) {
        basket.add(item);
    }

    public void removeItem(Buyable item) {
        basket.remove(item);
    }
//
    public void clearItem() {
        basket.clear();
    }

    public float checkTotalValue() {
        float totalValue = 0;
                for (Buyable item : basket) {
                    totalValue += item.checkValue();
                }
        return totalValue;
    }
}
