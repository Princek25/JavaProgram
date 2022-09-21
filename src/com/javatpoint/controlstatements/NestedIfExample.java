package com.javatpoint.controlstatements;

public class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        int weight = 30;
        if (age>=18){
            if(weight>40){
                System.out.println("You are eligible to donate blood");
            }
            else {
                System.out.println("Your are not eligible to donate blood");
            }
        }
        else{
            System.out.println("Age must be greater than 18");
        }

    }
}
