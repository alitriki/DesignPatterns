package org.winside.patterns.creation.prototype;

public class PrototypeMain  {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car originalCar = new Car();
        originalCar.setBrand("Toyota");
        originalCar.setModel("Camry");
        originalCar.setYear(2022);
        originalCar.setPrice(25000.0);
        originalCar.setColor("Red");

        try {
            // Clone the original car
            Car clonedCar = originalCar.clone();

            // Modify the properties of the cloned car
            clonedCar.setColor("Blue");
            clonedCar.setPrice(27000.0);

            // Print the details of both cars
            System.out.println("Original Car:");
            System.out.println(originalCar.getBrand() + " " + originalCar.getModel());
            System.out.println("Year: " + originalCar.getYear());
            System.out.println("Price: $" + originalCar.getPrice());
            System.out.println("Color: " + originalCar.getColor());

            System.out.println();

            System.out.println("Cloned Car:");
            System.out.println(clonedCar.getBrand() + " " + clonedCar.getModel());
            System.out.println("Year: " + clonedCar.getYear());
            System.out.println("Price: $" + clonedCar.getPrice());
            System.out.println("Color: " + clonedCar.getColor());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}