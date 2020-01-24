package com.capgemini.interfaces;

public interface Television {

    boolean on();
    void off();
    int switchChannel(int newChannel);
    /* public abstract */ int getCurrentChannel();
}
