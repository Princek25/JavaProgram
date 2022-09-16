package com.w3resource.datatype;
import java.util.Scanner;

public class MinuteConverter {
    public static void main(String[] args) {
        double minutesInYear = 60*24*365;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a value of minute");
        double minute = sc.nextDouble();
        long years = (long) (minute/minutesInYear);
        int days = (int) (minute/60/24)%365;
        System.out.println(minute + " minute is approx to  " + years + " years " + days + " days");

    }
}
