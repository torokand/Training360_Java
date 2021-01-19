package com.company.classstructureconstructors;

public class Store {
    private String product;
    private int stock = 0;

    public Store(String product) {
        this.product = product;
    }

    public void store(int amount) {
        this.stock += amount;
    }

    public void dispatch(int amount) {
        this.stock -= amount;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Store{" +
                "product='" + product + '\'' +
                ", stock=" + stock +
                '}';
    }
}
