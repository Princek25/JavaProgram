package com.javatpoint.controlstatement;
import java.util.Scanner;

// A year is leap, if it is divisible by 4 and 400. But, not by 100.

public class LeapYear {
    public static void main(String[] args) {
        int year = 2021;
        if ((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println("This Year is a Leap Year");
        }
        else{
            System.out.println("This year is not a leap year");
        }

    }
}
