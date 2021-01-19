package com.company.classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What the name of product:");
        String name = scanner.nextLine();

        System.out.println("What the price of products?");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());

        System.out.println("How much decreasing the price?");
        int decreasePrice = scanner.nextInt();
        product.decreasePrice(decreasePrice);
        System.out.println(product.getName() + " new Price: " + product.getPrice());

        System.out.println("How much increasing the price?");
        int increasePrice = scanner.nextInt();
        product.increasePrice(increasePrice);
        System.out.println(product.getName() + " new Price: " + product.getPrice());

    }
}
