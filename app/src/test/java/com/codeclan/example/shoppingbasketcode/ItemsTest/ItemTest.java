package com.codeclan.example.shoppingbasketcode.ItemsTest;

import com.codeclan.example.shoppingbasketcode.Items.Bread;
import com.codeclan.example.shoppingbasketcode.Items.Crisps;
import com.codeclan.example.shoppingbasketcode.Items.Item;
import com.codeclan.example.shoppingbasketcode.Items.Pop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/9/17.
 */
public class ItemTest {

    Item item;
    Item item2;
    Pop pop;
    Crisps crisps;
    Bread bread;

    @Before
    public void before() {
        pop = new Pop("Coke", 1.10);
        crisps = new Crisps("Walkers", 1.23);
        bread = new Bread("Hovis", 1.23);
    }

    @Test
    public void itemExists() {
        assertNotNull(pop);
    }

    @Test
    public void itemHasValue() {
        assertEquals(1.23, bread.checkValue(), 0.01);
    }

    @Test
    public void getPopBrand() {
        assertEquals("Coke", pop.getBrand());
    }

    @Test
    public void getCrispBrand() {
        assertEquals("Walkers", crisps.getBrand());
    }

    @Test
    public void getBreadValue() {
        assertEquals(1.23, bread.checkValue(), 0.01);
    }



}