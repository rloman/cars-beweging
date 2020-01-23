package com.capgemini.carcase.polymorphism.overriding.object;

public class Person {

    private String name ="Unknown";


    @Override
    public String toString() {

        return this.name;
    }
}
