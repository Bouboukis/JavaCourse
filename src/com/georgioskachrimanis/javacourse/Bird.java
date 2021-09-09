package com.georgioskachrimanis.javacourse;

public abstract class Bird extends Animal implements CanFly{

    //Constructors
    public Bird(String name) {
        super(name);
    }

    // Implemented Methods
    @Override
    public void eat()
    {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe()
    {
        System.out.println(getName() + " is breathing air");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its winds");
    }
}
