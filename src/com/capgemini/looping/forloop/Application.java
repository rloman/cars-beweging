package com.capgemini.looping.forloop;

public class Application {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("End of program / loop");

        for (; ; ) {
            System.out.println("This will run for ever ... ");
        }
    }

}
