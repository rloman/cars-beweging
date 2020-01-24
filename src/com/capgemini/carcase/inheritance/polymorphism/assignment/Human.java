package com.capgemini.carcase.inheritance.polymorphism.assignment;

import com.capgemini.interfaces.Television;

public  abstract class Human {

    private String name;

    private Television tv;

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

    public Television getTv() {
        return tv;
    }

    public void setTv(Television tv) {
        this.tv = tv;
    }

    public  abstract void walk();

    public void printIt() {

    }

}
