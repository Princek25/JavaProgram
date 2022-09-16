package com.w3resource.datatype;
import java.util.Scanner;
// incomplete
public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a value between 0 to 1000");
        int a = sc.nextInt();
        int firstDigit = a%10;
        int remainingNumber = a/10;
        int secondDigit = remainingNumber%10;
        remainingNumber = remainingNumber/10;





    }
}
