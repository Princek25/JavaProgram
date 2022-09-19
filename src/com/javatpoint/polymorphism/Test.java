package com.javatpoint.polymorphism;

// Topic - Method Overloading
// Creating two method with (same name) but (argument are different) in (same class)

public class Test {
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();  // calling 1st show method
        t.show(10);  // calling 2nd show method
    }
}
