package com.hmrctest.view;

import com.hmrctest.model.Product;
import com.hmrctest.service.Checkout;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by hassanshahab on 13/07/2015.
 */
public class CheckoutView {
    private Checkout checkout = new Checkout();

    public String output(List<Product> products) {
        float total = checkout.process(products);
        BigDecimal amount = new BigDecimal(total);
        return products + " > £" + amount.divide(new BigDecimal(100));
    }
}
