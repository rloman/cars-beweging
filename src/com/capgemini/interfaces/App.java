package com.capgemini.interfaces;

public class App {

    public static void main(String[] args) {
      
        Television tv = new Samsung();

        System.out.println(tv.on());

        tv.off();

        tv.on();

        int newCurrentChannel = tv.switchChannel(5);

        System.out.println(newCurrentChannel);


        System.out.println(tv.getCurrentChannel());

        Television panasonic = new Panasonic();

        panasonic.on();

        System.out.println(panasonic.switchChannel(3));

    }
}
