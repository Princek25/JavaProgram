package com.w3resource.conditionalstatement;
import java.util.Scanner;

// incomplete

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month number 1 to 12 ");
        int a = sc.nextInt();

        if (a==1 && a==3 && a==5 &&a==7 && a==8 && a==10 && a==12){
            System.out.println("It has 31 days");
        }
        if (a==4 && a==6 && a==9 && a==11){
            System.out.println("It has 30 days");
        }
        else {
            System.out.println("It february it may 28/29 days");
        }
    }
}
