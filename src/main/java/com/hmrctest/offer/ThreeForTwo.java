package com.hmrctest.offer;

import com.hmrctest.model.Product;

import java.util.List;

/**
 * Created by hassanshahab on 13/07/2015.
 */
public class ThreeForTwo implements Offer {
    public int apply(List<Product> products) {
        if (products.size() == 0) return 0;
        int price = products.get(0).getPrice();

        int totalCount = products.size();

        int threeForTwo = totalCount / 3;
        threeForTwo *= 2;
        threeForTwo += totalCount % 3;

        return threeForTwo * price;
    }
}
