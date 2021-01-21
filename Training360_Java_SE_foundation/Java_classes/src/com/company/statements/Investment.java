package com.company.statements;

public class Investment {
    protected double cost = 0.3;
    protected int fund;
    protected int interestRate;
    protected boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return this.fund;
    }

    public double getYield(int days) {
        double yield = 0.0;
        yield = this.fund * ((interestRate - cost) / 100 / 365);
        return yield;
    }

    public double close(int days) {
        if (active == true) {
            active = false;
            return (this.getFund() + this.getYield(days));
        } else {
            return 0;
        }
    }
}
