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
    Buyable pop;
    Crisps crisps;


    @Before
    public void before() {
        bread = new Bread("Hovis", 1.23);
        item = new Bread("Kingsmill", 1.23);
        pop = new Pop("Coke", 1.10);
        crisps = new  Crisps("Walkers", 0.70);
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

    @Test
    public void canAddAVarietyOfItems() {
        basket.addItem(bread);
        basket.addItem(pop);
        basket.addItem(crisps);
        assertEquals(3.03, basket.checkTotalValue(), 0.01);
    }

    @Test
    public void checkForMultipleInstancesOfSameItem() {
        basket.addItem(bread);
        assertEquals(1, basket.checkInstancesofBread());
    }

    @Test
    public void checkForMultipleInstancesOfSameItemAgain() {
        basket.addItem(bread);
        basket.addItem(bread);
        assertEquals(2, basket.checkInstancesofBread());
    }
//
    @Test
    public void breadOddOrEven() {
        basket.addItem(bread);
        basket.addItem(bread);
        basket.checkInstancesofBread();
        assertEquals(true, basket.checkInstancesofBreadOddEven());
    }

    @Test
    public void breadOdd() {
        basket.addItem(bread);
        basket.checkInstancesofBread();
        assertEquals(false, basket.checkInstancesofBreadOddEven());
    }


    @Test
    public void breadZero() {
        basket.checkInstancesofBread();
        assertEquals(true, basket.checkInstancesofBreadOddEven());
    }

    @Test
    public void calcDiscountEven() {
        basket.addItem(bread);
        basket.addItem(bread);
        basket.checkInstancesofBread();
        assertEquals(1.23, basket.calcDiscountEven(), 0.01);
    }

    @Test
    public void calcDiscountOdd() {
        basket.addItem(bread);
        basket.addItem(bread);
        basket.addItem(bread);
        basket.checkInstancesofBread();
        assertEquals(1.23, basket.calcDiscountEven(), 0.01);
    }

    @Test
    public void calcDiscountZero() {
        basket.checkInstancesofBread();
        assertEquals(0, basket.calcDiscountEven(), 0.01);
    }










    }
