package com.georgioskachrimanis.javacourse;

public abstract class Animal {
    private String name;

    // Constructors
    public Animal(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    // Methods
    public abstract void eat();
    public abstract void breathe();

}
