package com.capgemini.carcase.overloading;

public class App {

    public static void main(String[] args) {
        Car bmw = new Car(80);

        System.out.println(bmw.getMileage());

        bmw.drive();

        System.out.println(bmw.getMileage());

        bmw.drive(150.00);

        System.out.println(bmw.getMileage());
    }
}
