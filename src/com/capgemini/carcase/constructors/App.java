package com.capgemini.carcase.constructors;

public class App {

    public static void main(String[] args) {

        Car c = new Car("aabb49");

        System.out.println(c.licensePlate);

        Car d= new Car("aabb49");

        boolean areTheSameObject = c == d;

        System.out.println(areTheSameObject);

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

    }
}
