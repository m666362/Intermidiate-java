package com.example.javapractice;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Launching car simulator");
        Car mytoyota = new Car("Orange", "wood");
        Car myhonda = new Car("Audi", 2);
        System.out.println(mytoyota.cc_color + "\t" + mytoyota.cc_interior);
        System.out.println(mytoyota.brand + "\t" + myhonda.getNoofseat());
        myhonda.cc_interior = "Metal";

        System.out.println(mytoyota.cc_color + "\t" + mytoyota.cc_interior);


//        mytoyota.cc_color = "Orange";
//        System.out.println("My car color is "+ mytoyota.cc_color + " and it has "+ mytoyota.getCc_no_of_seats() + " seats");
//        System.out.println("My car color is "+ mytoyota.cc_color + " and it has "+ mytoyota.cc_interior + " interior");

    }
}
