package com.javatpoint.controlstatement.ifelse;

// We can also use ternary operator (? :) to perform the task of if...else statement.
// It is a shorthand way to check the condition. If the condition is true, the result
// of ? is returned. But, if the condition is false, the result of : is returned.

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 12;
        // using ternary operator

        String a = (number%2==0) ? "Even Number " : "Odd Number";
        System.out.println(a);
    }
}
