package com.company.trainerapp;

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
    }
}
