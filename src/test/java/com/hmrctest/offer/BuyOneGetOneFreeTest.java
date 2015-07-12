package com.hmrctest.offer;

import com.hmrctest.model.Apple;
import com.hmrctest.model.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by hassanshahab on 13/07/2015.
 */
public class BuyOneGetOneFreeTest {

    @Test
    public void testApply() throws Exception {
        BuyOneGetOneFree offer = new BuyOneGetOneFree();

        List<Product> products = new ArrayList();
        products.add(new Apple());
        products.add(new Apple());

        assertTrue("Offer of 2 apples", offer.apply(products) == 60);

        products.add(new Apple());
        products.add(new Apple());
        assertTrue("Offer of 4 apples", offer.apply(products) == 120);

        products.add(new Apple());
        assertTrue("Offer of 5 apples", offer.apply(products) == 180);
    }
}