package com.codeclan.example.shoppingbasketcode;

/**
 * Created by mac on 6/11/17.
 */

public class checkOut {

    private double totalValueBeforeDiscounts;
    private double totalValueOfDiscounts;


    public checkOut() {
        this.totalValueBeforeDiscounts = 0;
        this.totalValueOfDiscounts = 0;
    }

    public double totalValueBeforediscounts(Basket basket) {
        totalValueBeforeDiscounts += basket.checkTotalValue();
        return totalValueBeforeDiscounts;
    }

    public double getTotalDiscountValue() {
        return totalValueOfDiscounts;
    }

    public void aboveTenDiscount() {
        if (totalValueBeforeDiscounts>=10) {
            totalValueOfDiscounts += (totalValueBeforeDiscounts * 0.1);
        }
        else {
            totalValueOfDiscounts += 0;
        }
    }

    public void hasLoyalityCard() {
        totalValueOfDiscounts += (totalValueBeforeDiscounts * 0.02);
    }
}
