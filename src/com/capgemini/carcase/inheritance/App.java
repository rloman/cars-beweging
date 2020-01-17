package com.capgemini.carcase.inheritance;

public class App {

    public static void main(String[] args) {
        Truck myTruck = new Truck();

        myTruck.setColor("Green");

        System.out.println(myTruck.getMileage());

        System.out.println(myTruck.getColor());

        myTruck.setMileage(10000.25);


        System.out.println(myTruck.getMileage());

        Truck anOtherTruck = new Truck();


        System.out.println(myTruck.getLicensePlate());
        System.out.println(anOtherTruck.getLicensePlate());


    }
}
