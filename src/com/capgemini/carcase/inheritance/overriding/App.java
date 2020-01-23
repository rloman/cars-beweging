package com.capgemini.carcase.inheritance.overriding;

public class App {

    public static void main(String[] args) {
        Racecar myRacecar = new Racecar();

        myRacecar.drive();

        System.out.println(myRacecar.getMileage());
    }
}
