package org.winside.patterns.creation.abstractFactory;

public class Car extends Vehicle {
    public Car(String name, String type) {
        super(name, type);
    }

    @Override
    public void drive() {
        System.out.println("Driving a car: " + getName());
    }
}
