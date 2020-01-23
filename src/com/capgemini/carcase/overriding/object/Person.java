package com.capgemini.carcase.overriding.object;

public class Person {

    private String name ="Unknown";


    @Override
    public String toString() {

        return this.name;
    }
}
