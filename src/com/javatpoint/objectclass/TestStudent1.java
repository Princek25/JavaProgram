package com.javatpoint.objectclass;

// 1) Object and Class Example: Initialization through reference
// printing the output of student class in TestStudent1 class

public class TestStudent1 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.id);
        System.out.println(student.name);
    }
}
