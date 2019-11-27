package com.example.javapractice;

public class Car {

    public String cc_color = "Black";
    static String cc_interior = "Plastic";
    public String brand = "Honda";
    private int noofseat = 5;
    public Car(String chosencolor, String choseninterior){
        cc_color = chosencolor;
        cc_interior = choseninterior;
    }

    public Car(String chosenbrand, int givennumberseat){

        brand = chosenbrand;
        noofseat = givennumberseat;
    }

    public int getNoofseat() {
        return noofseat;
    }
}
