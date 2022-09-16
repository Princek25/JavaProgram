package com.w3resource.conditionalstatement;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a day number");
        int a = sc.nextInt();

        // using if statement-

        if(a==1){
            System.out.println("Monday");
        }
        if(a==2){
            System.out.println("Tuesday");
        }
        if (a==3){
            System.out.println("Wednesday");
        }
        if (a==4){
            System.out.println("Thursday");
        }
        if (a==5){
            System.out.println("Friday");
        }
        if (a==6){
            System.out.println("Saturday");
        }
        if (a==7){
            System.out.println("Sunday");
        }
    }
}
