package com.codeclan.example.shoppingbasketcode;

/**
 * Created by mac on 6/11/17.
 */

public class checkOut {

    private double totalValueBeforeDiscounts;


    public checkOut() {
        this.totalValueBeforeDiscounts = 0;
    }

    public double totalValueBeforediscounts(Basket basket) {
        totalValueBeforeDiscounts += basket.checkTotalValue();
        return totalValueBeforeDiscounts;
    }
}
