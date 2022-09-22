package com.javatpoint.abstraction;
import  java.util.Scanner;

// Topic - Interface Introduction

interface Client{
    void input();  // Public+Abstract
    void output();// Public+Abstract
}
class Developer implements Client{
    String name; double sal;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:- ");
        name=sc.nextLine();
        System.out.println("Enter Salary:- ");
        sal = sc.nextDouble();
    }
    public void output(){
        System.out.println(name + " " + sal);
    }

    public static void main(String[] args) {
        Client c = new Developer();
        c.input();
        c.output();
    }
}
