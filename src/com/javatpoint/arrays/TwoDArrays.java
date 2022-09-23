package com.javatpoint.arrays;
import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [] [] numbers = new int[rows][cols];

        // input - outer loop controls rows
        for (int i=0;i<rows;i++){
            //inner loop controls column
            for (int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        // output - outer loop controls rows
        for (int i=0;i<rows;i++){
            //inner loop controls column
            for (int j=0;j<cols;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
