package com.javatpoint.polymorphism;

// 1) super is used to refer immediate parent class instance variable.

class Animal1{
    String color = "White";
}
class Dog1 extends Animal1{
    String color = "Black";
    void printColor(){
        System.out.println(color); //Print color of Dog Class
        System.out.println(super.color); // Print color of Animal class
    }
}

public class TestSuper1 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.printColor();
    }
}
