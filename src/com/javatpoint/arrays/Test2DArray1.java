package com.javatpoint.arrays;

public class Test2DArray1 {
    public static void main(String[] args) {
        // Declaring and initializing 2D array
        int arr[][] = {{1,2,3},{2,4,5},{4,4,5}}; // 3 rows and 3 columns

        // Printing 2D array
        for (int i=0;i<3;i++){      // for 3 rows
            for (int j=0;j<3;j++){ // for 3 columns
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
