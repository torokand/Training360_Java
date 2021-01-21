package com.company.statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az időpontont ");
        System.out.print("óra: ");
        int hours = scanner.nextInt();
        System.out.print("perc: ");
        int minutes = scanner.nextInt();
        System.out.print("másodperc: ");
        int seconds = scanner.nextInt();

        Time time1 = new Time(hours, minutes, seconds);
        System.out.println("Az első időpont: " + time1 + " = " + time1.getInMinutes() + " perc");

        System.out.println("Kérem a másik időpontont ");
        System.out.print("óra: ");
        hours = scanner.nextInt();
        System.out.print("perc: ");
        minutes = scanner.nextInt();
        System.out.print("másodperc: ");
        seconds = scanner.nextInt();

        Time time2 = new Time(hours, minutes, seconds);
        System.out.println("A második időpont: " + time2 + " = " + time2.getInSeconds() + " másodperc");

        System.out.println("Az első korábbi, mint a második: " + time1.earlierThan(time2));


    }
}
