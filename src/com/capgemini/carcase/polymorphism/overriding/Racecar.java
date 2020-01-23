package com.capgemini.carcase.polymorphism.overriding;

public class Racecar extends Car {

    @Override
    public void drive() {
        System.out.println("Driving Racecar ...");
    }
}
