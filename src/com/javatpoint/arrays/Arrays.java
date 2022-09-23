package com.javatpoint.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3]; // creating array object
        marks[0] = 97; // physics
        marks[1] = 76; // chemistry
        marks[2] = 76; // english
          // System.out.println(marks[0]); instead of doing that use for loop

        for (int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

    }
}
