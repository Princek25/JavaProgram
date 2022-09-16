package com.w3resource.basicpart1;
import java.util.Scanner;

// Swapping two numbers using user input

public class Question15 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First number");
        a = sc.nextInt();
        System.out.println("Input Second number");
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;
        System.out.println("After swapping :- " + a + " and "+ b );



    }
}
