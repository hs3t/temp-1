package com.hmrctest.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by hassanshahab on 12/07/2015.
 */
public class AppleTest {

    @Test
    public void testGetPrice() throws Exception {
        Apple apple = new Apple();
        assertTrue("Apple has a price", apple.getPrice() == 60);
    }

    @Test
    public void testGetName() throws Exception {
        Apple apple = new Apple();
        assertTrue("Apple has a name", apple.getName().equals("Apple"));
    }
}