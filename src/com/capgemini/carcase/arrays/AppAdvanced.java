package com.capgemini.carcase.arrays;

public class AppAdvanced {

    public static void main(String[] args) {

        int[] numbers2 = new int[]{7, 11, 20}; // valid

        int[] numbers = {7, 11, 20};


        System.out.println("Basic for ...");
        // basic loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // enhanced for. bright new ...
        System.out.println("Enhanced for ... ");
        for(int n : numbers) {
            System.out.println(n);
        }

        // String array

        String[] names = {"John", "Mike", "Francine", "Will"};

        for(String name: names) {
            System.out.println("A member of the group is: "+name);
        }
    }
}
