package com.javatpoint.inheritance;

// Topic - Inheritance

class Employee{  // Parent class
    int salary = 40000;
}

public class Programmer extends Employee{ // child class inherit to parent class
    int bonus = 4000;

    public static void main(String[] args) {
        Programmer pr = new Programmer();
        System.out.println("Programmer salary is:- " +pr.salary);
        System.out.println("Bonus of Programmer is:- " +pr.bonus);
    }
}
