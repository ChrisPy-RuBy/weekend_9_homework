package com.codeclan.example.shoppingbasketcode;

import com.codeclan.example.shoppingbasketcode.Items.Bread;
import com.codeclan.example.shoppingbasketcode.Items.Buyable;
import com.codeclan.example.shoppingbasketcode.Items.Crisps;
import com.codeclan.example.shoppingbasketcode.Items.Pop;

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

    @Before
    public void before(){
        checkout = new checkOut();
        basket = new Basket();
        bread = new Bread("Hovis", 1.23);
        pop = new Pop("Coke", 1.10);
        crisps = new  Crisps("Walkers", 0.70);
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
    public void 

}