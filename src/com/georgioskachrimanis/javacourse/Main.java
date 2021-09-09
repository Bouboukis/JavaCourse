package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Doge");
        dog.breathe();
        dog.eat();

        System.out.println("*********************************************");
        Parrot parrot = new Parrot("Bob the Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println("*********************************************");
        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.breathe();
        penguin.eat();
        penguin.fly();

    }
}
