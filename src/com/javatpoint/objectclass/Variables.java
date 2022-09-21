package com.javatpoint.objectclass;

public class Variables {
    static int b = 20; // Static variable
    int c = 30;       // Instance variable

    public static void main(String[] args) {

        // Local Variable
        int a = 10;
        System.out.println(a);

        // Static Variable
        System.out.println(Variables.b);

        // for Instance Variable we need to make an object of the class
        Variables variables = new Variables(); // Note: Variable is a name of class here also
        System.out.println(variables.c);

    }
}
