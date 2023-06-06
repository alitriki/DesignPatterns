package org.winside.patterns.creation.abstractFactory;

public class MotorcycleFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle createVehicle(String name, String type, VehicleType vehicleType) {
        switch (vehicleType) {
            case MOTORCYCLE:
                return new Motorcycle(name, type);
            case SPORT_BIKE:
                return new SportBike(name, type);
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }
}
