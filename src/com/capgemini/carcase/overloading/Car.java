package com.capgemini.carcase.overloading;


// shows overloading
public class Car {

    private String licensePlate;
    private double mileage;


    // no  - arg constructor
    public Car() {

    }

    // overloaded constructor
    public Car(int myCurrentMileage) {
        this.mileage = myCurrentMileage;
    }
    // overloaded constructor
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void drive() {
        mileage += 10;
    }

    // overloaded method!!!
    double drive(double increment) {

        this.mileage += increment;

        return this.mileage;
    }

    // compile error
//    void drive(double delta) {
//
//    }

    /* compile error
    void drive(String a) {

    }

    void drive(String b) {

    }
    */

    double drive(int increment) {

        return this.mileage;
    }


    public double getMileage() {
        return this.mileage;
    }


}
