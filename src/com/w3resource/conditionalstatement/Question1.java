package com.w3resource.conditionalstatement;
import java.util.Scanner;

public class Question1 {
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
