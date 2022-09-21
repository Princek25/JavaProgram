package com.javatpoint.objectclass;

class Employee{
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s){
        id=i;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();     //
        Employee e2 = new Employee();    // --> Creating three objects
        Employee e3 = new Employee();   //
        e1.insert(101, "Prince", 45000);       //
        e2.insert(102, "Rahul", 40000);       // --> calling object through insert method
        e3.insert(103, "Aditya", 50000);     //
        e1.display();     //
        e2.display();    // --> calling object through display method
        e3.display();   //


    }
}
