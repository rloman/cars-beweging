package com.capgemini.carcase.inheritance;

public class Truck extends Car {

    private double maxWeight;

    public Truck() {
        super();
    }


    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
