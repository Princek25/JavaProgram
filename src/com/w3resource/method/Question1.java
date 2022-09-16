package com.w3resource.method;
import java.util.Scanner;

//1. Write a Java method to find the smallest number among three numbers. using static method
//Test Data:
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:
//The smallest value is 25.0

class Test{
    static void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number");
        int a = sc.nextInt();
        System.out.println("Input the second number");
        int b = sc.nextInt();
        System.out.println("Input the third number");
        int c = sc.nextInt();
        if(a<b) {
            if (a<c)
                System.out.println("The smallest number is:- " + a);
            else
                System.out.println("The smallest number is:- " + c);
        }
        else {
            if (b<a)
                System.out.println("The smallest number is:- "  + b);
            else
                System.out.println("The smallest number is:- " + c);
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        Test.m1();

    }
}
