package com.capgemini.carcase.arrays;

public class Application {

    public static void main(String[] args) {


        int[] numbers = new int[3];

        // basic loop
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }

        numbers[0] = 7;
        numbers[1] = 11;
        numbers[2] = 20;

        // basic loop
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }

        //better loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
