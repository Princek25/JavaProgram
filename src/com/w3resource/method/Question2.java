package com.w3resource.method;
import java.util.Scanner;

//Write a Java method to compute the average of three numbers. using non-static method
//Test Data:
//Input the first number: 25
//Input the second number: 45
//Input the third number: 65
//Expected Output:
//The average value is 45.0

public class Question2 {
    void method(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number");
        double d1 = sc.nextDouble();
        System.out.println("Input the second number");
        double d2 = sc.nextDouble();
        System.out.println("Input the third number");
        double d3 = sc.nextDouble();
        System.out.println("The average value is:- " + (d1+d2+d3)/3);
    }
    public static void main(String[] args) {
        Question2 object = new Question2();
        object.method();

    }
}
