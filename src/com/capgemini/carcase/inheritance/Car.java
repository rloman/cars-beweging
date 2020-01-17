package com.capgemini.carcase.inheritance;

public class Car {

    private String licensePlate;
    private double mileage;
    private String color;

    public Car() {

    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
