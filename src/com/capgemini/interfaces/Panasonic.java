package com.capgemini.interfaces;

public class Panasonic implements Television {

    private boolean on;
    private int currentChannel;

    @Override
    public boolean on() {
        return false;
    }

    @Override
    public void off() {

    }

    @Override
    public int switchChannel(int newChannel) {
        return 0;
    }

    @Override
    public int getCurrentChannel() {
        return 0;
    }
}
