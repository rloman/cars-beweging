package com.capgemini.carcase.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppIntegerList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();


        numbers.add(3);

        List<Boolean> listOfBooleans = new LinkedList<>();

        listOfBooleans.add(true);

        // wrappers types

        Byte b = 3; //byte
        Short s = 4;
        Integer i = 326; //int
        Long l = 73737333L;

        Double d = 3.5;
        Float f = 3.5f;

        Character c = 'c'; // char

        Boolean booleanValue = true;

    }
}
