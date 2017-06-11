package com.codeclan.example.shoppingbasketcode;

import com.codeclan.example.shoppingbasketcode.Items.Bread;
import com.codeclan.example.shoppingbasketcode.Items.Buyable;
import com.codeclan.example.shoppingbasketcode.Items.Crisps;
import com.codeclan.example.shoppingbasketcode.Items.Pop;
import com.codeclan.example.shoppingbasketcode.Items.bottleOfWhisky;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/11/17.
 */
public class checkOutTest {

    checkOut checkout;
    Basket basket;
    Buyable bread;
    Buyable pop;
    Buyable crisps;
    Buyable whisky;
    Buyable whisky2;

    @Before
    public void before(){
        checkout = new checkOut();
        basket = new Basket();
        bread = new Bread("Hovis", 1.23);
        pop = new Pop("Coke", 1.10);
        crisps = new  Crisps("Walkers", 0.70);
        whisky = new bottleOfWhisky("Bells", 10.99);
        whisky2 = new bottleOfWhisky("Bells", 9.99);
    }

    @Test
    public void checkOutExists() {
        assertNotNull(checkout);
    }

    @Test
    public void calculateBasketTotal() {
        basket.addItem(bread);
        basket.checkTotalValue();
        assertEquals(1.23, checkout.totalValueBeforediscounts(basket), 0.01);
    }

    @Test
    public void overTenPoundsDiscount(){
        basket.addItem(whisky);
        basket.addItem(whisky);
        checkout.totalValueBeforediscounts(basket);
        checkout.aboveTenDiscount();
        assertEquals(2.19, checkout.getTotalDiscountValue(), 0.01);
    }

    @Test
    public void notOverTenPoundsDiscount(){
        basket.addItem(bread);
        basket.addItem(bread);
        checkout.totalValueBeforediscounts(basket);
        checkout.aboveTenDiscount();
        assertEquals(0, checkout.getTotalDiscountValue(), 0.01);
    }

    @Test
    public void justOverTenPoundsDiscount(){
        basket.addItem(whisky2);
        basket.addItem(crisps);
        checkout.totalValueBeforediscounts(basket);
        checkout.aboveTenDiscount();
        assertEquals(1.07, checkout.getTotalDiscountValue(), 0.01);
    }

    @Test
    public void loyalityDiscount() {
        basket.addItem(whisky2);
        basket.addItem(crisps);
        checkout.totalValueBeforediscounts(basket);
        checkout.hasLoyalityCard();
        assertEquals(0.21, checkout.getTotalDiscountValue(), 0.01);

    }

}