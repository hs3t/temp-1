package com.hmrctest.service;

import com.hmrctest.model.Product;

import java.util.List;

/**
 * Created by hassanshahab on 12/07/2015.
 */
public class Checkout {
    public int process(List<Product> products) {
        if(products == null || products.size() == 0) {
            throw new IllegalArgumentException("Products can not be null");
        }
        int total = 0;

        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
