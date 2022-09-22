package com.javatpoint.encapsulation;

//A Java class to test the encapsulated class Account.

public class TestEncapsulation {
    public static void main(String[] args) {
        // Creating instance of Account class
        Account acc = new Account();
        // Setting values through setter methods
        acc.setAcc_no(123456789789L);
        acc.setName("Prince Kumar");
        acc.setEmail("Princek2530@gmail.com");
        acc.setAmount(50000f);
        // Getting values through getter methods
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }

}
