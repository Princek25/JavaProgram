package com.javatpoint.java_object_class;

// Topic - Initialization of object  through reference variable

class Student {
    int id;  // instance or non-static variable
    String name;

    public static void main(String[] args) {
        Student student = new Student();  // object-> student
        System.out.println(student.id);  // accessing member through reference variable
        System.out.println(student.name);


    }
}
