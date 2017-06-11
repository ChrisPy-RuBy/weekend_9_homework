package com.codeclan.example.shoppingbasketcode;

import com.codeclan.example.shoppingbasketcode.Items.Buyable;

import java.util.ArrayList;

/**
 * Created by mac on 6/9/17.
 */

public class Basket {

    private ArrayList<Buyable> basket = new ArrayList<Buyable>();
    private int instancesOfBread;


    public Basket(){
        this.instancesOfBread = 0;


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

    public int checkInstancesofBread() {
         for (Buyable item : basket) {
             String itemType = item.itemType();
            if (itemType.equals("bread")) {
                instancesOfBread += 1;
             }
             else {
                instancesOfBread += 0;
            }
        }
        return instancesOfBread;
    }

    public boolean checkInstancesofBreadOddEven() {
        if (instancesOfBread % 2 == 0) {
            return true;

        }
        else {
            return false;
        }
    }


    public double calcDiscountEven() {
        if (instancesOfBread % 2 == 0) {
            return ((instancesOfBread / 2) * 1.23);
        }
        else {
            return (((instancesOfBread - 1)/2) * 1.23);
        }
    }
}
