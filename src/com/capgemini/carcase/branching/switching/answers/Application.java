package com.capgemini.carcase.branching.switching.answers;

public class Application {

    public static void main(String[] args) {
        DateCalculator dateCalculator = new DateCalculator();

        int days = dateCalculator.getDaysForMonth(1);

        System.out.println(days);
    }
}
