package com.javatpoint.polymorphism;

// Creating a parent class
class Bank{
    int getRateOfInterest(){return 0;}
}
// Creating a child class of bank
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}
// Creating another child class of bank
class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
// Creating another child class of bank
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
// Three classes are overriding the method of a parent class

public class TestOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest:- " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest:- " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest:- " + a.getRateOfInterest());
    }
}
