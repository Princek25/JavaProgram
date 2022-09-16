package com.w3resource.basicpart1;
import java.util.Scanner;

// Area and Perimeter of Rectangle with User Input

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Length");
        float a = sc.nextFloat();
        System.out.println("Input Breadth");
        float b = sc.nextFloat();
        System.out.println("Area of Rectangle:- " + (a*b));
        System.out.println("Perimeter of Rectangle:- " + (2*(a+b)));

    }
}
