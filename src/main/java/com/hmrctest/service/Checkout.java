package com.hmrctest.service;

import com.hmrctest.model.Apple;
import com.hmrctest.model.Orange;
import com.hmrctest.model.Product;
import com.hmrctest.offer.BuyOneGetOneFree;
import com.hmrctest.offer.Offer;
import com.hmrctest.offer.ThreeForTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hassanshahab on 12/07/2015.
 */
public class Checkout {
    public int process(List<Product> products) {
        if (products == null || products.size() == 0) {
            throw new IllegalArgumentException("Products can not be null");
        }
        int total = 0;

        List<Product> apples = new ArrayList();
        List<Product> oranges = new ArrayList();

        for (Product p : products) {
            if (p instanceof Apple) {
                apples.add(p);
            } else if (p instanceof Orange) {
                oranges.add(p);
            } else {
                throw new RuntimeException("Product not supported " + p.getClass().getName());
            }
        }

        total = applyOffer(apples, new BuyOneGetOneFree());
        total += applyOffer(oranges, new ThreeForTwo());

        return total;
    }

    private int applyOffer(List<Product> products, Offer offer) {
        return offer.apply(products);
    }
}
