package com.example.javapractice;

public class CarSimulator {
    public static void main(String[] args) {

        System.out.println("Launching car simulator");
        Car mytoyota = new Car("Orange", "wood");
        Car myhonda = new Car("Audi", 2);

        System.out.println(mytoyota.cc_color + "\t" + mytoyota.cc_interior);
        System.out.println(myhonda.brand + "\t" + myhonda.getNoofseat());

        myhonda.cc_interior = "Metal";

        System.out.println(mytoyota.cc_color + "\t" + mytoyota.cc_interior);

        SelfDrivingCar autobot = new SelfDrivingCar("Orange", "Alumunium");

        System.out.println( autobot.cc_color + "\t" + autobot.cc_interior  );
        System.out.println( autobot.brand + "\t" + autobot.getNoofseat()  );
        autobot.drive();
        mytoyota.drive();

    }
}
