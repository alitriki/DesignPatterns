package org.winside.patterns.creation.abstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        VehicleAbstractFactory carFactory = new CarFactory();
        VehicleAbstractFactory motorcycleFactory = new MotorcycleFactory();

        Vehicle car = carFactory.createVehicle("Sedan", "Four-Wheeler", VehicleType.CAR);
        car.drive();

        Vehicle sportsCar = carFactory.createVehicle("Sports Car", "Four-Wheeler", VehicleType.SPORTS_CAR);
        sportsCar.drive();

        Vehicle motorcycle = motorcycleFactory.createVehicle("Sport Bike", "Two-Wheeler", VehicleType.MOTORCYCLE);
        motorcycle.drive();

        Vehicle sportBike = motorcycleFactory.createVehicle("Cruiser", "Two-Wheeler", VehicleType.SPORT_BIKE);
        sportBike.drive();
    }
}