package com.w3resource.basicpart1;

// Area and Perimeter of circle with fix data, radius = 7.5

public class Question11_1 {
    static double radius = 7.5f;
    public static void main(String[] args) {
        double perimeter = (2 * Math.PI * radius);
        double area = (Math.PI * radius * radius);
        System.out.println("Perimeter of circle:- " + perimeter);
        System.out.println("Area of circle:- " + area);

    }

}
