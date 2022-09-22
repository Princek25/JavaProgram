package com.javatpoint.encapsulation;

// Topic - Encapsulation
// A java class which is a fully encapsulated class
// It has a private data member and getter and setter methods

public class Student {
    private String name;      // private data member
    public String getName(){ // getter method for a name
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class Test{
    public static void main(String[] args) {
        Student s = new Student();
        // setting value in the name member
        s.setName("Prince");
        // getting value of the name member
        System.out.println(s.getName());
    }
}
