package com.capgemini.carcase.inheritance.overriding;

public class Racecar extends Car {

    @Override
    public void drive() {
        System.out.println("Driving Racecar ...");
    }
}
