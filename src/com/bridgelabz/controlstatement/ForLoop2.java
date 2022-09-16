package com.bridgelabz.controlstatement;

// Printing table from user input

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int a = sc.nextInt();
        int i;
        for (i=1;i<=10;i++){
            System.out.println(a + " x " + i + " = " + (a*i));
        }

    }


}
