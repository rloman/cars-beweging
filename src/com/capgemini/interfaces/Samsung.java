package com.capgemini.interfaces;

import java.util.List;

public class Samsung implements Television {

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
