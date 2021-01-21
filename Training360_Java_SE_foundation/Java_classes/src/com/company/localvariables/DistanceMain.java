package com.company.localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(12.8, false);
        System.out.println("Distance: " + distance.getDistanceInKm() + " km, distance is exact?: " + distance.isExact());

        int a = (int) distance.getDistanceInKm();
        System.out.println(a);
    }
}
