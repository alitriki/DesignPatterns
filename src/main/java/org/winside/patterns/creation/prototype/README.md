# Prototype Design Pattern

The Prototype design pattern is a creational pattern that allows the creation of objects by cloning an existing object, known as the prototype, instead of creating new instances from scratch. It provides an efficient way to create new objects with pre-defined properties and configurations by copying an existing object.

The Prototype pattern is particularly useful in scenarios where object creation is expensive or complex, and when you want to avoid the overhead of creating objects from scratch. It allows you to create new instances by copying existing ones, making it easier to customize and modify the copied objects as needed.

## Context

In this exercise, you will work on a project that involves creating different types of objects using the Prototype design pattern. The goal is to understand how the Prototype pattern can be used to create new objects by cloning existing ones.

## Instructions

In this exercise, you will implement the `Car` class using the Prototype design pattern. The goal is to understand how the Prototype pattern allows you to create new objects by cloning an existing object and customize them as needed.

Follow the instructions below to implement the `Car` class and create a `Main` class to test it:

1. Create a new Java class named `Car` that implements the `Cloneable` interface.
   - The `Cloneable` interface allows objects of the class to be cloned.

2. Add the following private properties to the `Car` class:
   - `brand` (String): Represents the brand of the car.
   - `model` (String): Represents the model of the car.
   - `year` (int): Represents the manufacturing year of the car.
   - `price` (double): Represents the price of the car.
   - `color` (String): Represents the color of the car.
   - `engine` (CarEngine): Represents the engine of the car.

3. Implement the necessary getters and setters for each property.
   - Add public getter methods to access the values of the properties.
   - Add public setter methods to set new values for the properties.

4. Implement the constructor and instanciate the property engine inside it

5. Override the `clone()` method from the `Object` class to perform a shallow copy of the `Car` object.
   - Use the `super.clone()` method to obtain a copy of the object.
   - Cast the cloned object to the `Car` class and return it.

6. Create a new Java class named `Main` that contains the `main` method.
   - This class will be used to test the implementation of the `Car` class.

7. Inside the `main` method of the `Main` class, create an instance of the `Car` class.
   - Set values for the properties of the car using the setter methods.

8. Use the `clone()` method to create a new object by cloning the original car object.
   - Modify the properties of the cloned car object using the setter methods.

9. Print the details of both the original car and the cloned car to verify that modifying the cloned object does not affect the original object.

10. Run the `Main` class and observe the output to confirm that the implementation of the `Car` class and the Prototype pattern is correct.

11. Notice the 2 second sleep in the constructor is only executed once

12. Reflect on the use cases where the Prototype design pattern can be beneficial.
   - Think about scenarios where object creation is costly or complex, and discuss how the Prototype pattern can help alleviate the overhead.

