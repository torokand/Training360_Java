package com.company.classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void transfer(BankAccount bankAccount, int amount) {
        this.balance -= amount;
        bankAccount.balance += amount;
    }

    public String getInfo() {
        return owner + " (" + accountNumber + ") " + balance + "\r\n";
    }
}
