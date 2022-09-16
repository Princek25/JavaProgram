package com.w3resource.datatype;
import java.util.Scanner;

//2. Write a Java program that reads a number in inches, converts it to meters.
// Note: One inch is 0.0254 meter.
// Test Data
// Input a value for inch: 1000
// Expected Output :
// 1000.0 inch is 25.4 meters

public class MeterConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a inch value");
        double inch = sc.nextDouble();
        double meter = inch * 0.0254;
        System.out.println(inch + " inch is equal to " + meter + " meter");

    }
}
