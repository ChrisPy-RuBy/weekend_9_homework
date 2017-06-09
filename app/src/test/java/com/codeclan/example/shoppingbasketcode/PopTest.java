package com.codeclan.example.shoppingbasketcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/9/17.
 */
public class PopTest {

    @Test
    public void popExists() {
        Pop pop = new Pop("Coke", 1.10);
        assertNotNull(pop);
    }

    @Test
     public void getBrand() {
        Pop pop = new Pop("Coke", 1.10);
        assertEquals("Coke", pop.getBrand());


    }
}