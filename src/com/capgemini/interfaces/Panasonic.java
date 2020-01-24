package com.capgemini.interfaces;

public class Panasonic implements Television {

    private boolean on;

    private int currentChannel;

    @Override
    public boolean on() {
        this.on = true;

        return this.on;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int getCurrentChannel() {
        return this.currentChannel;
    }

    @Override
    public int switchChannel(int newChannel) {
        this.currentChannel = newChannel;

        return this.currentChannel;
    }
}
