package com.company.classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the bank account owner name?");
        String owner1 = scanner.nextLine();
        System.out.println("What is the bank account number?");
        String accountNumber1 = scanner.nextLine();
        System.out.println("What is the bank account balance?");
        int balance1 = scanner.nextInt();
        scanner.skip("\r\n|\r|\n");

        BankAccount bankAccount1 = new BankAccount(accountNumber1, owner1, balance1);

        System.out.println(bankAccount1.getInfo());

        System.out.println("What is the bank account owner name?");
        String owner2 = scanner.nextLine();
        System.out.println("What is the bank account number?");
        String accountNumber2 = scanner.nextLine();
        System.out.println("What is the bank account balance?");
        int balance2 = scanner.nextInt();
        scanner.skip("\r\n|\r|\n");

        BankAccount bankAccount2 = new BankAccount(accountNumber2, owner2, balance2);

        System.out.println(bankAccount2.getInfo());

        System.out.println("What is the account1 deposit amount?");
        int deposit1 = scanner.nextInt();
        bankAccount1.deposit(deposit1);
        System.out.println(bankAccount1.getInfo());

        System.out.println("What is the account1 withdraw amount?");
        int withdraw1 = scanner.nextInt();
        bankAccount1.withdraw(withdraw1);
        System.out.println(bankAccount1.getInfo());

        System.out.println("What is the account2 deposit amount?");
        int deposit2 = scanner.nextInt();
        bankAccount2.deposit(deposit2);
        System.out.println(bankAccount2.getInfo());

        System.out.println("What is the account2 withdraw amount?");
        int withdraw2 = scanner.nextInt();
        bankAccount2.withdraw(withdraw2);
        System.out.println(bankAccount2.getInfo());

        System.out.println("What amount transfer to account1 to account2?");
        int transferAmount = scanner.nextInt();

        bankAccount1.transfer(bankAccount2, transferAmount);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());
    }
}
