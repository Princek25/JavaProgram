package com.javatpoint.controlstatement.forloop;

//*
//* *
//* * *
//* * * *
//* * * * *

public class Pattern3 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){    // for 5 column
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
