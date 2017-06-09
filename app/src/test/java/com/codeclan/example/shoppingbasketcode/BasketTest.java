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
    Basket basket3;
    Buyable item;
    Buyable bread;


    @Before
    public void before() {
        bread = new Bread("Hovis", 1.23);
        item = new Bread("Kingsmill", 1.23);
        basket = new Basket();
        basket2 = new Basket();
        basket3 = new Basket();
    }

    @Test
    public void basketExistsTest() {
        assertNotNull(basket);
    }

    @Test
    public void basketCanContainItem() {
        basket.addItem(item);
        assertEquals(1, basket.numberOfItems());
    }

    @Test
    public void basketCanContainItemNotHardcoded() {
        basket.addItem(item);
        basket.addItem(item);
        assertEquals(2, basket.numberOfItems());
    }
//
//    @Test
//    public void canAddItemToBasket() {
//        basket.addItem(1);
//        assertEquals(2, basket.numberOfItems());
//
//    }
//
//    @Test
//    public void canAddZeroToBasket() {
//        basket2.addItem(0);
//        assertEquals(0, basket2.numberOfItems());
//    }
//
    @Test
    public void canRemoveItemFromBasket() {
        basket.addItem(item);
        basket.removeItem(item);
        assertEquals(0, basket2.numberOfItems());
    }
//
    @Test
    public void canClearItemsAllItemsFromBasket() {
        basket.addItem(item);
        basket3.clearItem();
        assertEquals(0, basket3.numberOfItems());
    }

    @Test
    public void itemsInBasketHaveValue() {
        basket.addItem(item);
        assertEquals(1.23, basket.checkTotalValue(), 0.01);
    }

    @Test
    public void itemsInBasketHaveValueOtherValue() {
        basket.addItem(item);
        basket.addItem(item);
        assertEquals(2.46, basket.checkTotalValue(), 0.01);
    }

    @Test
    public void canPassBreadToBasket() {
        basket.addItem(bread);
        assertEquals(1, basket.numberOfItems());
    }









}