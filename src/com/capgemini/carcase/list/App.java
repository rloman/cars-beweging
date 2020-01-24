package com.capgemini.carcase.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> someList = new LinkedList<>();

        someList.add("A");
        someList.add("B");
        someList.add("Victim");

        someList.remove(2);


        for(String element: someList) {

            System.out.println(element);

        }



        // enhanced for loop
        for(String someThingInTheList: someList) {

            System.out.println(someThingInTheList);

        }

        // basic for loop
        for(int i = 0;i<someList.size();i++) {
            System.out.println(someList.get(i));
        }



//        someList.clear();

        System.out.println(someList.isEmpty());


        List<String> someOtherList = new ArrayList<>();
        someOtherList.add("Zebra");
        someOtherList.add("Elephant");

        someOtherList.addAll(someList);

        System.out.println(someOtherList);

        boolean containsElephant = someOtherList.contains("Elephant");

        if(containsElephant) {
            System.out.println("Elephant is in the list");
        }
        else {
            System.out.println("Elephant is NOT in the list");
        }

        loopOverIt(someOtherList);

    }

    public static void loopOverIt(List<String> aList) {
        for(String element: aList) {
            System.out.println("An element:"+element);
        }
    }


}
