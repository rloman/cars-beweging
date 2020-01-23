package com.capgemini.carcase.inheritance.polymorphism.assignment;

public class HumanDoctor {

    public void walkAll(Human[] humans) {

        for(Human human: humans) {
            human.walk();
        }

    }
}
