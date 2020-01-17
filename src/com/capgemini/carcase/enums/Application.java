package com.capgemini.carcase.enums;

public class Application {

    public static void main(String[] args) {
        Beer myBeer = new Beer(Size.LARGE);

        Beer anotherOne = new Beer(Size.MEDIUM);

        Beer stillMore = new Beer(Size.XLARGE);

        stillMore.setSize(Size.SMALL);

        for(Size oneValue : Size.values()) {
            System.out.println(oneValue);

            // you can print the ordinal number
            System.out.println(oneValue.ordinal());
        }

        System.out.println(Size.LARGE.getSize());
    }
}
