package com.capgemini.carcase.answers.constructors;

public class BoyApp {

    public static void main(String[] args) {
        // this has the same affect as:
        Boy aBoy = new Boy("Fares");
        {
//            Boy boy = new Boy();
//            boy.setName("Fares");
        }


        String theName = aBoy.getName();

        System.out.println(theName);





    }
}
