package com.javatpoint.inheritance;

// Topic - Multilevel Inheritance
// babyDog-----> Dog------>Animal
// All the properties of Dog and Animals comes to babyDog

class babyDog extends Dog{
    void weep(){
        System.out.println("Weeping.....");
    }
}
public class TestInheritance2 {
    public static void main(String[] args) {
        babyDog bd = new babyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
