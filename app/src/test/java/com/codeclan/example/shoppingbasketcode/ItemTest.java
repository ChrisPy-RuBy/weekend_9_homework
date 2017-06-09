package com.codeclan.example.shoppingbasketcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/9/17.
 */
public class ItemTest {

    Item item;
    Item item2;

    @Before
    public void before() {
        item = new Item();
        item2 = new Item();
    }

    @Test
    public void itemExists() {
        assertNotNull(item);
    }

    @Test
    public void itemHasValue() {
        assertEquals(1.23, item.checkValue(), 0.01);
    }



}