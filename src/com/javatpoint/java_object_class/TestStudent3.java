package com.javatpoint.java_object_class;

//1) Object and Class Example: Initialization through reference

public class TestStudent3 {
    public static void main(String[] args) {

        //Creating Objects
        Student student1 = new Student();
        Student student2 = new Student();

        // initializing objects
        student1.id=101;
        student1.name="Prince";
        student2.id=102;
        student2.name="Kumar";

        //Printing data
        System.out.println(student1.id + " " + student1.name);
        System.out.println(student2.id + " " + student2.name);
    }
}
