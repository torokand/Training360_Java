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
        double yield = 0;
        yield = this.getFund() * this.interestRate / 100.0 * days / 365.0;
        return yield;
    }

    public double close(int days) {
        if (active == true) {
            active = false;
            return ((this.getFund() + this.getYield(days)) * 0.997);
        } else {
            return 0;
        }
    }
}
