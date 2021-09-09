package com.georgioskachrimanis.javacourse;

public class Dog extends Animal {
    // Constructors
    public Dog(String name) {
        super(name);
    }

    //Implemented methods
    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing air.");

    }
}
