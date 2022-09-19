package com.javatpoint.polymorphism;

class Vehicle{
    void run (){
        System.out.println("Vehicle is running...");
    }
}
public class Bike2 extends Vehicle{
    void run(){
        System.out.println("Bike is running safely...");
    }

    public static void main(String[] args) {
        Bike2 object = new Bike2();
        object.run();
    }
}
