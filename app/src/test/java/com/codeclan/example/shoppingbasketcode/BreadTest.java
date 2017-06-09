package com.codeclan.example.shoppingbasketcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/9/17.
 */
public class BreadTest {

    Bread bread;

    @Before
    public void before() {
        bread = new Bread("Hovis", 1.23);
    }


    @Test
    public void breadExists() {
        assertNotNull(bread);
    }

    @Test
    public void breadGetBrand() {
        assertEquals("Hovis", bread.getBrand());
    }

//    @Test
//    public void breadGetValue() {
//        assertEquals(1.23, bread.checkValue(), 0.01);
//
//    }

}