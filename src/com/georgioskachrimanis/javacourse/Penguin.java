package com.georgioskachrimanis.javacourse;

public class Penguin extends Bird{

    // Constructors
    public Penguin(String name) {
        super(name);
    }

    // Implemented Methods

    // We overide the method because it adds some functionality to the class
    @Override
    public void fly() {
        super.fly(); // using the super method of fly inside the overriden method fly...
        System.out.println( "... but can not fly! Prefer swimming... ");
    }
}
