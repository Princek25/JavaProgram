package com.javatpoint.objectclass.method;

class Test{
    static void display(){
        System.out.println("Static Method");
    }
    void show(){
        System.out.println("Non Static Method");
    }
}

public class MethodExample {
    public static void main(String[] args) {
        Test.display();// static method call through class name not object
        Test obj = new Test(); // In non-static method we need to create an object here obj is an object
        obj.show(); // And call through object name obj


    }
}
