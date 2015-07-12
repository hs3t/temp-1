package com.hmrctest.view;

import com.hmrctest.model.Apple;
import com.hmrctest.model.Orange;
import com.hmrctest.model.Product;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by hassanshahab on 13/07/2015.
 */
public class CheckoutViewTest {

    @Test
    public void testView() throws Exception {
        CheckoutView view = new CheckoutView();
        ArrayList<Product> products = new ArrayList();
        products.add(new Apple());
        products.add(new Orange());
        products.add(new Orange());
        products.add(new Apple());
        assertThat("Price of basket is £1.1", view.output(products), is("[Apple, Orange, Orange, Apple] > £1.1"));
    }
}