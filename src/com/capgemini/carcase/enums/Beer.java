package com.capgemini.carcase.enums;

public class Beer {

    private Size size;


    public Beer(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
