package com.javatpoint.java_object_class;

// Topic - Initialization of object through method

public class Student2 {
    int rollNo;
    String name;

    void insertRecord(int r, String n){
        rollNo = r;
        name = n;
    }
    void displayInformation(){
        System.out.println(rollNo + " " + name);
    }

}
