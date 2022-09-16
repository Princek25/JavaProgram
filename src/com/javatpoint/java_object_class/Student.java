package com.javatpoint.java_object_class;

//1) Object and Class Example: Initialization through reference

class Student {
    int id;  // instance or non-static variable
    String name;

    public static void main(String[] args) {
        Student student = new Student();  // object-> student
        System.out.println(student.id);  // accessing member through reference variable
        System.out.println(student.name);


    }
}
