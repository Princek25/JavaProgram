package com.javatpoint.objectclass;

// 2) Object and Class Example: Initialization through method

public class TestStudent4 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        // initializing an object through method in student2 class
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
