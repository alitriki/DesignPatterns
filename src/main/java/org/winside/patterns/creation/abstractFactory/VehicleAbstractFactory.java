package org.winside.patterns.creation.abstractFactory;

public interface VehicleAbstractFactory {
    Vehicle createVehicle(String name, String type, VehicleType vehicleType);
}
