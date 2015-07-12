package com.hmrctest.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hassanshahab on 12/07/2015.
 */
public class OrangeTest {

    @Test
    public void testGetPrice() throws Exception {
        Orange orange = new Orange();
        assertTrue("Orange has a price", orange.getPrice()==25);
    }

    @Test
    public void testGetName() throws Exception {
        Orange orange = new Orange();
        assertTrue("Orange has a name", orange.getName()=="Orange");
    }
}