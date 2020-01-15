package com.capgemini.carcase.branching;

public class IfTrainer {

    public static void main(String[] args) {

        Car car = new Car();


        boolean trafficLightIsGreen = false;

        if (trafficLightIsGreen) {
            car.drive();
            System.out.println("The traffic light is green now");
        } else {
            car.stop();
        }

        System.out.println(car.getSpeed());

        // bad
        int age = 51;
        if (age > 50) {
            System.out.println("You are pretty old ...");
        } else {
            System.out.println("You are young");
        }


        // good, for nesting if and else
        age = 100;
        if (age >= 100) {
            System.out.println("You are dead!");
        }
        else {
            if (age > 50) {
                System.out.println("You are old");
            } else {
                System.out.println("You are young");
            }
        }
        // there is no keyword 'elseif' in Java
    }
}
