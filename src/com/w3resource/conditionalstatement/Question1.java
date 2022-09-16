package com.bridgelabz.practiceproblem;
import java.util.Scanner;

// Write a Java program to get a number from the user and print whether it is positive or negative

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int a = sc.nextInt();
        if (a>0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }



    }
}
