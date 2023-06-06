package org.winside.patterns.creation.abstractFactory;

public class SportsCar  extends Vehicle {
    public SportsCar(String name, String type) {
        super(name, type);
    }

    @Override
    public void drive() {
        System.out.println("Driving a sports car: " + getName());
    }
}
