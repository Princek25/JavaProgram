package com.javatpoint.abstraction;

// Example of an abstract class that has abstract and non-abstract methods

abstract class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear Changed");
    }
}
//Creating a Child class which inherits Abstract class

class Honda extends Bike{
    void run(){
        System.out.println("Running safely...");
    }
}
//Creating a Test class which calls abstract and non-abstract methods

public class TestAbstraction2 {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
