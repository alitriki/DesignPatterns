package org.winside.patterns.creation.abstractFactory;

public class CarFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle createVehicle(String name, String type, VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car(name, type);
            case SPORTS_CAR:
                return new SportsCar(name, type);
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }
}
