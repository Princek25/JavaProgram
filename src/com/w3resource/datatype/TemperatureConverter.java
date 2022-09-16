package com.w3resource.datatype;
import java.util.Scanner;

//1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//Test Data
//Input a degree in Fahrenheit: 212
//Expected Output:
//212.0 degree Fahrenheit is equal to 100.0 in Celsius

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit Value");
        double fahrenheit = sc.nextDouble();
        double celsius = ((5*(fahrenheit-32))/9);
        System.out.println(fahrenheit  + "  degree fahrenheit value is equal to  " + celsius + " celsius value");


    }
}
