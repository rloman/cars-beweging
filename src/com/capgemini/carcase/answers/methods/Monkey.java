package com.capgemini.carcase.answers.methods;

public class Monkey {

    private int age;

    public static void main(String[] args) {
        System.out.println("This should run!");


        Monkey m = new Monkey();
        m.age = 14;
        System.out.println(m.age);

        int currentAge = m.birthDay();
        System.out.println(currentAge);

        System.out.println(m.age);

        double myAge = 55.25;

        System.out.println(m.add(3,4));
    }

    public int add(int a, int b) {
        return a+b;
    }


    public int birthDay() {
        age = age + 1;

        System.out.println("Vrijdag");

        int whatever = 10000;



        return 100;
    }


}

class Banana {

}
