package com.capgemini.carcase.overriding;

public class Car {

    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void drive(int increment) {
        this.mileage += increment;
    }

    public void drive() {

    }
}
