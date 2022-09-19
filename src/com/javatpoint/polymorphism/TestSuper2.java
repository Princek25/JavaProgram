package com.javatpoint.polymorphism;

// 2) super can be used to invoke parent class method

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Eating Bread...");
    }
    void bark(){
        System.out.println("Barking....");
    }
    void work(){
        super.eat();
        bark();
    }
}

public class TestSuper2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
