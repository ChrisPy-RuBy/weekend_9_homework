package com.codeclan.example.shoppingbasketcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/9/17.
 */
public class BasketTest {

    Basket basket;
    Basket basket2;

    @Before
    public void before() {
        basket = new Basket(1);
        basket2 = new Basket(0);
    }

    @Test
    public void basketExistsTest() {
        assertNotNull(basket);
    }

    @Test
    public void basketCanContainItem() {
        assertEquals(1, basket.numberOfItems());
    }

    @Test
    public void basketCanContainItemNotHardcoded() {
        assertEquals(0, basket2.numberOfItems());
    }

    @Test
    public void canAddItemToBasket() {
        basket.addItem(1);
        assertEquals(2, basket.numberOfItems());

    }


}