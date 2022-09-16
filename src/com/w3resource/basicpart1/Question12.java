package com.bridgelabz.practiceproblem;
import java.util.Scanner;

// Average of three numbers with user input

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number");
        int a = sc.nextInt();
        System.out.println("Input Second Number");
        int b = sc.nextInt();
        System.out.println("Input Third Number");
        int c = sc.nextInt();
        System.out.println("Average:- " + (a+b+c)/3);


    }
}
