package com.hmrctest.offer;

import com.hmrctest.model.Product;

import java.util.List;

/**
 * Created by hassanshahab on 13/07/2015.
 */
public interface Offer {
    int apply(List<Product> products);
}
