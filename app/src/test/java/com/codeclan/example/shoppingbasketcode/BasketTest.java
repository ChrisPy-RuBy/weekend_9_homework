package com.codeclan.example.shoppingbasketcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/9/17.
 */
public class BasketTest {



    @Test
    public void basketExistsTest() {
        Basket basket = new Basket(1);
        assertNotNull(basket);
    }

    @Test
    public void basketCanContainItem() {
        Basket basket = new Basket(1);
        assertEquals(1, basket.numberOfItems());
    }

    @Test
    public void basketCanContainItemNotHardcoded() {
        Basket basket = new Basket(0);
        assertEquals(0, basket.numberOfItems());
    }


}