package com.company.statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a vizsgálandó számot: ");
        int x = scanner.nextInt();
        if (x % 3 == 0) {
            System.out.println(x + " osztható 3-mal.");
        } else {
            System.out.println(x + " nem osztható 3-mal.");
        }
    }
}
