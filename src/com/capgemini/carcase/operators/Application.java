package com.capgemini.carcase.operators;

public class Application {

    public static void main(String[] args) {


        int c = 1+2; // add

        System.out.println(c);

        // -

        // *

        c = 12*12;

        System.out.println(c);

        //  =>         /

        c = c / 12;

        // mod operator => %
        // remainder operator

        int d = 76/3;

        System.out.println(d);

        int remainder = 76 % 3;

        System.out.println("Remainder is: "+remainder);


        int age = 51;

        age = age + 1;
        // same
        age++;

        age = age -1;
        // same
        age--;

        System.out.println("Age is now:"+age);

        System.out.println(age++);

        System.out.println(age);

        System.out.println(++age);


        //WARNING

        age = 40;
        System.out.println(age);
        System.out.println(age+1);
        System.out.println(age);

        // this is changing the age
        age++;
        age--;

        // this is NOT changing the age
        System.out.println(age+1);


        age += 3; // age = age +3;
        age -= 5;

        if(age != 100) {

        }

        if (age == 100 || c > 12) {

           //
        }

        String printOut = (age > 100) ? "Old" : "Young";

        System.out.println(printOut);


    }
}
