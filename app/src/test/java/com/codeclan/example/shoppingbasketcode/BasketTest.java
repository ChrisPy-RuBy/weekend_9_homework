package com.codeclan.example.shoppingbasketcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/9/17.
 */
public class BasketTest {

    @Test
    public void basketExistsTest() {
        Basket basket = new Basket();
        assertNotNull(basket);
    }

}