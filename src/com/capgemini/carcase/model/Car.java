package com.capgemini.carcase.model;

public class Car {

     String licensePlate;
     String color;
     String brand;
     double mileage;

     public double fuelLevel;

     public double drive() {

         System.out.println("Driving car ... ");

         mileage = mileage +1;


         return mileage;
     }

     String getBrand() {
         return brand;
     }

     public void fillFuelTank(double fuel) {

         if(fuel + fuelLevel > 55 ){
             return;
         }
         else {
             fuelLevel = fuelLevel+ fuel;
         }
     }
}
