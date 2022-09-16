package com.w3resource.conditionalstatement;
import java.util.Scanner;

// Q5 - solve using switch case

public class Question5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number Between 1 to 7 ");
        int weekDay = sc.nextInt();

        switch (weekDay){
            case 1 : System.out.println("Monday"); break;
            case 2 : System.out.println("Tuesday"); break;
            case 3 : System.out.println("Wednesday"); break;
            case 4 : System.out.println("Thursday"); break;
            case 5 : System.out.println("Friday"); break;
            case 6 : System.out.println("Saturday"); break;
            case 7 : System.out.println("Sunday"); break;
            default: System.out.println("Invalid Number...!");

        }
    }
}
