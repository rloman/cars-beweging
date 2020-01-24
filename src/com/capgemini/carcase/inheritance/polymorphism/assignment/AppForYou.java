package com.capgemini.carcase.inheritance.polymorphism.assignment;

import com.capgemini.interfaces.Samsung;
import com.capgemini.interfaces.Television;

public class AppForYou {

    public static void main(String[] args) {
        Human b = new BaseballPlayer();
        b.walk();

        Television tv = new Samsung();

        b.setTv(tv);

    }

}


