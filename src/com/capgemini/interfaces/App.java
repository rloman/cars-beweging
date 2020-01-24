package com.capgemini.interfaces;

import com.capgemini.carcase.inheritance.polymorphism.assignment.BaseballPlayer;
import com.capgemini.carcase.inheritance.polymorphism.assignment.Human;

public class App {

    public static void main(String[] args) {
        // fout
        Television tv = new Samsung();

        System.out.println(tv.on());

        tv.off();

        tv.on();

        int newCurrentChannel = tv.switchChannel(5);

        System.out.println(newCurrentChannel);


        System.out.println(tv.getCurrentChannel());

    }
}
