package com.example.javapractice;

public class Car {

    public String cc_color = "Black";
    public String brand = "Honda";
    protected String cc_interior = "Plastic";
    private int noofseat = 5;

    public Car(String chosencolor, String choseninterior){
        cc_color = chosencolor;
        cc_interior = choseninterior;
    }
    public Car(String chosenbrand, int givennumberseat){

        brand = chosenbrand;
        noofseat = givennumberseat;
    }

    public Car(){

    }

    public int getNoofseat() {
        return noofseat;
    }
    public void drive(){
        System.out.println("Car is moving");
    }
}
