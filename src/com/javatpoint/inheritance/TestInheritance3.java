package com.javatpoint.inheritance;

// Topic - Hierarchical Inheritance
// Dog and Cat class both inherit Animal class

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing....");
    }
}
public class TestInheritance3 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat(); // Properties of animal
    }
}
