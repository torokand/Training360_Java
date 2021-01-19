package com.company.classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("software");
        store.store(15);
        store.dispatch(10);
        System.out.println(store);
        System.out.println(store.getProduct() + ": " + store.getStock());

        Store store2 = new Store("hardware");
        store2.store(32);
        store2.dispatch(10);
        System.out.println(store);
        System.out.println(store2);
    }
}
