package com.hmrctest.service;

import com.hmrctest.model.Apple;
import com.hmrctest.model.Orange;
import com.hmrctest.model.Product;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by hassanshahab on 12/07/2015.
 */
public class CheckoutTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCheckoutWhenNullProducts() throws Exception {
        Checkout checkout = new Checkout();
        checkout.process(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckoutWhenNoProducts() throws Exception {
        Checkout checkout = new Checkout();
        checkout.process(new ArrayList<Product>());
    }

    @Test
    public void testCheckoutWithOneApple() {
        Checkout checkout = new Checkout();
        ArrayList<Product> products = new ArrayList();
        products.add(new Apple());
        assertTrue("Price of basket is 60", checkout.process(products) == 60);
    }

    @Test
    public void testCheckoutWithOneOrange() {
        Checkout checkout = new Checkout();
        ArrayList<Product> products = new ArrayList();
        products.add(new Orange());
        assertTrue("Price of basket is 25", checkout.process(products) == 25);
    }

    @Test
    public void testCheckoutWithOneOffer() {
        Checkout checkout = new Checkout();
        ArrayList<Product> products = new ArrayList();
        products.add(new Apple());
        products.add(new Orange());
        products.add(new Apple());
        products.add(new Apple());
        assertTrue("Price of basket is 145", checkout.process(products) == 145);
    }

    @Test
    public void testCheckoutWithTwoOffersProduct() {
        Checkout checkout = new Checkout();
        ArrayList<Product> products = new ArrayList();
        products.add(new Apple());
        products.add(new Orange());
        products.add(new Orange());
        products.add(new Orange());
        products.add(new Apple());
        products.add(new Apple());
        products.add(new Apple());
        assertTrue("Price of basket is 170", checkout.process(products) == 170);
    }

    @Test
    public void testCheckoutWithOneProductWithOffer() {
        Checkout checkout = new Checkout();
        ArrayList<Product> products = new ArrayList();
        products.add(new Orange());
        products.add(new Orange());
        products.add(new Orange());
        assertTrue("Price of basket is 50", checkout.process(products) == 50);
    }
}