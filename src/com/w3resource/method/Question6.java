package com.w3resource.method;
import java.util.Scanner;

//6. Write a Java method to compute the sum of the digits in an integer.
//Test Data:
//Input an integer: 25
//Expected Output:
//The sum is 7

public class Question6 {
    void m1(){
        int a,b,c=0;
        System.out.println("Input an Integer");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();

        while (a>0){
            b=a%10;
            c=c+b;

        }
    }
}
