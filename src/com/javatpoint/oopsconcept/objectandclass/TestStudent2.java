package com.javatpoint.oopsconcept.objectandclass;

//1) Object and Class Example: Initialization through reference

public class TestStudent2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.id=101;
        student.name="Prince";
        System.out.println(student.name + " " + student.id);
    }
}
