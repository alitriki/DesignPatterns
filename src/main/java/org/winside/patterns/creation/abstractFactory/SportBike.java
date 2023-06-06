package org.winside.patterns.creation.abstractFactory;

public class SportBike extends Vehicle {
    public SportBike(String name, String type) {
        super(name, type);
    }

    @Override
    public void drive() {
        System.out.println("Riding a sport bike: " + getName());
    }
}

