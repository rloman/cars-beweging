package com.capgemini.carcase.getset;

public class Car {

    private String licensePlate;
    private double mileage;


    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
