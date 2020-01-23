package com.capgemini.carcase.inheritance.polymorphism.assignment;

public class Man extends Human {

    public Man(String name) {
        super(name);
    }


    public void walk() {
        System.out.println("Walking Man ...");
    }
}
