package com.javatpoint.controlstatements;

//Java Program to demonstrate the use of If else-if ladder.
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.

public class IfElseIfExample {
    public static void main(String[] args) {
        int marks=65;
        if (marks<50){
            System.out.println("Failed");
        } else if (marks>=50 && marks<60) {
            System.out.println("Grade D");
        } else if (marks>=60 && marks<70) {
            System.out.println("Grade C");
        } else if (marks>=70 && marks<80) {
            System.out.println("Grade B");
        } else if (marks>=80 && marks<90) {
            System.out.println("Grade A");
        } else if (marks>=90 && marks<100) {
            System.out.println("Grade A+");
        }
        else {
            System.out.println("Invalid Marks");
        }

    }
}
