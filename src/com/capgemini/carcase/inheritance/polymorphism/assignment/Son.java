package com.capgemini.carcase.inheritance.polymorphism.assignment;

public class Son extends Man {

    public Son(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Walking Son ...");
    }
}
