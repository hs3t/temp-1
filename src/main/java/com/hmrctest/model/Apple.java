package com.hmrctest.model;

/**
 * Created by hassanshahab on 12/07/2015.
 */
public class Apple implements Product {
    public int getPrice() {
        return 60;
    }

    public String getName() {
        return "Apple";
    }

    @Override
    public String toString() {
        return getName();
    }
}
