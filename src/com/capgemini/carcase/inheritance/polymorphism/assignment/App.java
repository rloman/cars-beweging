package com.capgemini.carcase.inheritance.polymorphism.assignment;

public class App {

    public static void main(String[] args) {
        Human human = new Man("Sha");
        human.walk();

        Human female = new Female();

        female.walk();

        Human student = new Student();

        Human wineDrinker = new WineDrinker();

        HumanDoctor doctor = new HumanDoctor();

        Human[] people = new Human[]{human, female, student, wineDrinker};

        doctor.walkAll(people);

        System.out.println(human.getName());
    }
}
