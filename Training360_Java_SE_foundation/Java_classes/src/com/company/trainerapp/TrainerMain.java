package com.company.trainerapp;

import java.util.Scanner;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Big Joe", 1968);
        trainer.setName("John Doe");
        trainer.setYearOfBirth(1980);
        System.out.println(trainer.getName());
        System.out.println(trainer.getNameAndYearOfBirth());
        System.out.println(trainer.getAge(2021));
        trainer.changeName("Jack Doe");
        System.out.println(trainer.getName());

        Trainer anotherTrainer = new Trainer("Slow Mo", 1991);
        anotherTrainer.setName("Jack Doe");

        System.out.println(anotherTrainer.getName());

        System.out.println(trainer.getNameAndYearOfBirth());
        anotherTrainer.setYearOfBirth(1981);

        System.out.println(anotherTrainer.getNameAndYearOfBirth());

        anotherTrainer.changeName("Joe Doe");
        System.out.println(anotherTrainer.getName());

        anotherTrainer.setName("Jack Doe");
        System.out.println(anotherTrainer.getName());

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Year of Birth?");
        int yearOfBirth = scanner.nextInt();

        Trainer trainer1 = new Trainer(name, yearOfBirth);
        System.out.println(trainer1.getNameAndYearOfBirth());

        System.out.println("Age: " + trainer1.getAge(2021));
    }
}
