package com.bridgelabz.practiceproblem;
import java.util.Scanner;

// Taking two user input to print addition subtraction division multiplication and remainder

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number");
        int a = sc.nextInt();
        System.out.println("Input Second Number");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}
