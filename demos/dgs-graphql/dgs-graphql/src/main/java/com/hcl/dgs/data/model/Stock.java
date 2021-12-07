package com.hcl.dgs.data.model;

public class Stock {
    private final String name;
    private final float price;

    public Stock(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
