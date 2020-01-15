package com.capgemini.carcase.branching;

public class Car {

    private int speed;

    public void drive() {
        System.out.println("Car is driving ...");
        speed = 50;
    }

    public void stop() {

        System.out.println("Car is stopping ...");

        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }
}
