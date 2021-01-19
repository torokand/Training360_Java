package com.company.classstructureintegrate;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int priceIncrease) {
        this.price += priceIncrease;
    }

    public void decreasePrice(int priceDecrease) {
        this.price -= priceDecrease;

    }
}
