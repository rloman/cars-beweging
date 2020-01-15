package com.capgemini.carcase.branching.switching;

public class Application {


    public static void main(String[] args) {

        int age = 100;

        // using if ... which gets cumbersome after a lot of cases
        if(age == 100) {
            System.out.println("if: You are hunderd years young!");
        }
        else {
            if(age ==99) {
                System.out.println("You are ninety-nine years young!");
            }
            else {
                if(age ==98) {
                    System.out.println("You are ninety-eight years old!");
                }
                else {
                    if(age == 97) {
                        System.out.println("You are ninety-seven years old!");
                    }
                }
            }
        }

        System.out.println("Entering the switch case ... ");

        age = 25;


        // you can use the following types of variables in the switch case

        // int (also byte, short)
        // char
        // String (since Java 7)
        // later in this course: an enum
        // later in this course: the wrapper classes: Byte, Short, Integer (starting with a capital)

        boolean male = true;

//        switch(male) { // compile error, boolean type not allowed

//        }

        // using switch ... which keeps cleaner after a lot of cases.
        switch (age) {

            default:
                System.out.println("You are somewhat else years old!");
            case 100:

                System.out.println("You are hunderd years young!");


            case 99:
                System.out.println("You are ninety-nine years young!");

                break;

            case 98:
                System.out.println("You are ninety-eight years old!");


            case 97:
                System.out.println("You are ninety-seven years old!");

        }
    }
}
