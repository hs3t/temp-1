package com.hmrctest.offer;

import com.hmrctest.model.Orange;
import com.hmrctest.model.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by hassanshahab on 13/07/2015.
 */
public class ThreeForTwoTest {

    @Test
    public void testApply() throws Exception {
        ThreeForTwo offer = new ThreeForTwo();

        List<Product> products = new ArrayList();
        products.add(new Orange());
        products.add(new Orange());
        assertTrue("Offer of 2 oranges", offer.apply(products) == 50);


        products.add(new Orange());
        assertTrue("Offer of 3 oranges", offer.apply(products) == 50);

        products.add(new Orange());
        assertTrue("Offer of 4 oranges", offer.apply(products) == 75);

        products.add(new Orange());
        assertTrue("Offer of 5 oranges", offer.apply(products) == 100);

        products.add(new Orange());
        assertTrue("Offer of 6 oranges", offer.apply(products) == 100);
    }
}