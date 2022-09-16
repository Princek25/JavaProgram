package com.bridgelabz.practiceproblem;
import java.util.Scanner;

// Area and Perimeter of Circle using user input


public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a radius of circle");
        int a = sc.nextInt();
        System.out.println("Perimeter is:- " + (2*3.14*a));
        System.out.println("Area is:- " + (3.14*a*a));
    }
}
