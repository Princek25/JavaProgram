package com.w3resource.conditionalstatement;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = sc.nextDouble();
        System.out.println("Input b: ");
        double b = sc.nextDouble();
        System.out.println("Input c: ");
        double c = sc.nextDouble();

        double d = b*b-4.0*a*c;

        if(d>0.0){
            double r1 = (-b + Math.pow(d, 0.5))/(2.0*a);
            double r2 = (-b - Math.pow(d, 0.5))/(2.0*a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d==0){
            double r1 = (-b/a);
            System.out.println("The root is: " + r1);
        }
        else {
            System.out.println("The equation has no real root.");
        }
    }

}
