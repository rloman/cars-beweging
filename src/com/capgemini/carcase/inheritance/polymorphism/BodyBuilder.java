package com.capgemini.carcase.inheritance.polymorphism;

public class BodyBuilder extends Human {

    @Override
    public void walk() {
        System.out.println("Walking BodyBuilder ... ");
    }
}
