package com.capgemini.carcase.variables;

import com.capgemini.carcase.model.Car;

public class Application {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);

        byte age = 127;
        short age2 = 32767;
        int age3 = 404894949;

        // float example
        float f1 = 3.5f;


        double d1 = 3.5;

        double pi = 3.1415926535;

        char c = 'S';
        String s = "Sam";

        boolean raining = false;

        boolean old = age > 100;

        System.out.println(old);

        if (raining) {
            // drive();
        } else {
            // walk();
        }

        Car myCar = new Car();

        double m = myCar.drive();

        System.out.println(m);

        m = myCar.drive();

        System.out.println(m);

        myCar.fillFuelTank(33.5);

        System.out.println(myCar.fuelLevel);
        myCar.fillFuelTank(33.5);

        System.out.println(myCar.fuelLevel);

        myCar.fillFuelTank(33.5);

        System.out.println(myCar.fuelLevel);
        myCar.fillFuelTank(33.5);

        System.out.println(myCar.fuelLevel);
        myCar.fillFuelTank(33.5);

        System.out.println(myCar.fuelLevel);

    }
}