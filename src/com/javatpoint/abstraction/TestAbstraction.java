package com.javatpoint.abstraction;

// Creating interface that has 4 methods

interface A{
    void a();// by default, public and abstract
    void b();
    void c();
    void d();
}
//creating abstract class that provides the implementation

abstract class B implements A{
    public void c(){
        System.out.println("I am C");
    }
}
// creating subclass of abstract class, now we need to provide the implementation of the rest of the method
class M extends B{
    @Override
    public void a() {
        System.out.println("I am A");
    }

    @Override
    public void b() {
        System.out.println("I am B");
    }

    @Override
    public void d() {
        System.out.println("I am D");
    }
}
// creating TestAbstraction class that calls methods of A interface

public class TestAbstraction {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();

    }
}
