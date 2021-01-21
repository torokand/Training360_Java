package com.company.localvariables;

public class Distance {
    protected double distanceInKm;
    protected boolean exact;

    public Distance(double distanceInKm, boolean exact) {
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public boolean isExact() {
        return exact;
    }
}
