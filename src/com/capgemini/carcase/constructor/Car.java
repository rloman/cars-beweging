package com.capgemini.carcase.constructor;

public class Car {

    String licensePlate;
    double mileage;

    // no args contructor
    public Car() {

    }

    // compiler makes this for me
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Car(String licensePlate, double mileage) {
        this.licensePlate = licensePlate;
        this.mileage = mileage;
    }
}
