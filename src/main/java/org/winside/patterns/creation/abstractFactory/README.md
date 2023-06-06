## Abstract Factory Design Pattern

If you are familiar with factory design pattern in java, you will notice that we have a single Factory class.
This factory class returns different subclasses based on the input provided and factory class uses if-else or switch statement to achieve this. In the Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. Then an Abstract Factory class that will return the sub-class based on the input factory class. At first, it seems confusing but once you see the implementation, it’s really easy to grasp and understand the minor difference between Factory and Abstract Factory pattern.

## Context
In this exercise, you will practice implementing the Abstract Factory design pattern to create different types of vehicles. The goal is to understand how the abstract factory provides an interface for creating families of related objects without specifying their concrete classes.

## Instructions

1. Implement the `VehicleAbstractFactory` interface with the following method signature:
    - `createVehicle(String name, String type): Vehicle`

   This method should create and return a `Vehicle` object based on the provided name and type.

2. Implement the `CarFactory` class that implements the `VehicleAbstractFactory` interface. This factory should create different types of cars based on the provided name and type.

3. Implement the `MotorcycleFactory` class that implements the `VehicleAbstractFactory` interface. This factory should create different types of motorcycles based on the provided name and type.

4. In the `Main` class, complete the `main` method as follows:
    - Create an instance of the `CarFactory` and assign it to a variable.
    - Create an instance of the `MotorcycleFactory` and assign it to a variable.
    - Use the factories to create vehicles of different types by calling the `createVehicle` method.
    - Invoke the `drive` method on each vehicle to test the implementation.

5. Verify that the vehicles are created correctly and that they can be driven using the `drive` method.


**Additional Ressources**
[Abstract Factory tutorial](https://www.digitalocean.com/community/tutorials/abstract-factory-design-pattern-in-java)