package com.capgemini.carcase.inheritance.polymorphism.assignment;

public class BodyBuilder extends Man {

    public BodyBuilder(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Walking BodyBuilder ...");
    }
}
