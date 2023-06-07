package org.winside.patterns.creation.prototype;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;

    private CarEngine engine;

    public Car() {
        engine = new CarEngine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}