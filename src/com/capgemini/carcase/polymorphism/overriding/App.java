package com.capgemini.carcase.polymorphism.overriding;

public class App {

    public static void main(String[] args) {
        Racecar myRacecar = new Racecar();

        myRacecar.drive();

        System.out.println(myRacecar.getMileage());
    }
}
