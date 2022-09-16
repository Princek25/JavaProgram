package com.w3resource.basicpart1;
import java.util.Scanner;

// Table with for loop or without for loop

public class Question7 {
    public static void main(String[] args) {

        // Printing Table without loop:-
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int a = sc.nextInt();
        System.out.println(a + " x " + 1 + " = " + (a*1));
        System.out.println(a + " x " + 2 + " = " + (a*2));
        System.out.println(a + " x " + 3 + " = " + (a*3));
        System.out.println(a + " x " + 4 + " = " + (a*4));
        System.out.println(a + " x " + 5 + " = " + (a*5));
        System.out.println(a + " x " + 6 + " = " + (a*6));
        System.out.println(a + " x " + 7 + " = " + (a*7));
        System.out.println(a + " x " + 8 + " = " + (a*8));
        System.out.println(a + " x " + 9 + " = " + (a*9));
        System.out.println(a + " x " + 10 + " = " + (a*10));

        // Printing Table with for loop:-

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input Second Number");
        int b = sc1.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(b + " x " + i + " = " + (b*i));
        }

    }

}
