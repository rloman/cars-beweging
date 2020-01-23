package com.capgemini.carcase.inheritance.polymorphism;

public class App {

    public static void main(String[] args) {

        // Human is declared. I see a Human during compile type (so while coding)
        // BodyBuilder is constructed. I see a BodyBuilder during runtime (while running)
        Human sha = new BodyBuilder();

        sha.walk();

        // rhs should be fittable in lhs
//        BodyBuilder sha256 = new Human();

        byte b = 10;
        int age = b;


        float f = 13f;


    }
}
