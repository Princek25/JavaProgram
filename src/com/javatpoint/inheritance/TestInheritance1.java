package com.javatpoint.inheritance;

// Topic - Single Inheritance
// Dog -----> Animal

class Animal{  // Parent Class
    void eat(){
        System.out.println("Eating....");
    }
}
class Dog extends Animal{ // Child class
    void bark(){
        System.out.println("Barking....");
    }
}
public class TestInheritance1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();  // This is the properties of Animal
    }
}
