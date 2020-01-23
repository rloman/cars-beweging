package com.capgemini.carcase.inheritance.polymorphism.assignment;

public  abstract class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public Human() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  abstract void walk();

}
