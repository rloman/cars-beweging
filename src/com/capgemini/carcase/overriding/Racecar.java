package com.capgemini.carcase.overriding;

public class Racecar extends Car {

    @Override
    public void drive() {
        System.out.println("Driving Racecar ...");
    }
}
