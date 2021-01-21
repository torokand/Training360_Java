package com.company.statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a befektetetésre kerüló összeget: ");
        int fund = scanner.nextInt();
        System.out.println("Kérem a kamatlábat egész %-ban: ");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);
        System.out.println("Tőke: " + investment.getFund());
        int days = 50;
        System.out.println("Hozam " + days + " napra: " + investment.getYield(days));
        int days2 = 80;
        System.out.println("Kivett összeg " + days2 + " nap után: " + investment.close(days2));
        int days3 = 90;
        System.out.println("Kivett összeg " + days3 + " nap után: " + investment.close(days3));
    }
}
