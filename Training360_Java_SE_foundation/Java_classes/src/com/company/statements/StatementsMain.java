package com.company.statements;

public class StatementsMain {
    public static void main(String[] args) {
        int x = 5 + 6;

        System.out.println(5 + 6);

        System.out.println("Hello " + x + " World!");

        StatementsMain s = new StatementsMain();

        System.out.println(x = 8);

        System.out.println("".equals("aaa"));
        System.out.println("aaa".equals("aaa"));

        System.out.println((!(x % 2 == 0)) || true);

        x++;
        x = x + 1;
        System.out.println(x);

        System.out.println((x % 2 == 0) ? "páros" : "páratlan");

        int y = 11 - x;
        System.out.println(y);
        int z = 8;
        boolean b = x > y;
        System.out.println(b);
        boolean c = b || (z > 5);
        System.out.println(c);
        z++;
        System.out.println(z);
    }
}
