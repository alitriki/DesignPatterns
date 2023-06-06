package org.winside.patterns.creation.abstractFactory;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name, String type) {
        super(name, type);
    }

    @Override
    public void drive() {
        System.out.println("Riding a motorcycle: " + getName());
    }
}

