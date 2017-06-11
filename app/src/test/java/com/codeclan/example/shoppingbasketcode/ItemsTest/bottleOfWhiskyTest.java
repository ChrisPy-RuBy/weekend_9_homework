package com.codeclan.example.shoppingbasketcode.ItemsTest;

import com.codeclan.example.shoppingbasketcode.Items.bottleOfWhisky;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 6/11/17.
 */
public class bottleOfWhiskyTest {

    @Test
    public void bottleOfWhiskyExists() {
     bottleOfWhisky whisky = new bottleOfWhisky("Bells", 10.99);
        assertNotNull(whisky);
    }

}