package com.w3resource.conditionalstatement;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the 1st Number");
        int a = sc.nextInt();
        System.out.println("Input the 2nd Number");
        int b = sc.nextInt();
        System.out.println("Input the 3rd Number");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("The Greatest Number is:- " + a);
        } else if (b > a && b > c) {
            System.out.println("The Greatest Number is:- " + b);
        }
        else{
            System.out.println("The Greatest Number is:- " + c);
        }

    }
}
