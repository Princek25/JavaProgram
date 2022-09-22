package com.javatpoint.abstraction;

// Interface declaration: by first user
interface Drawable{
    void draw();
}
//Implementation: by second user
class Rectangle1 implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle1");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
//Using interface: by third user
public class TestInterface1 {
    public static void main(String[] args) {
        Drawable d =new Circle();
        d.draw();
    }
}
