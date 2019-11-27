package com.example.javapractice;

public class SelfDrivingCar extends Car {


    public SelfDrivingCar(String chosencolor, String choseninterior) {
        super(chosencolor, choseninterior);
        System.out.println("Hello there");
    }

    public void drive(){
        super.drive();
        System.out.println( "I am hanging" );
    }

}
