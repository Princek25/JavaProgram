package com.javatpoint.oopsconcept.objectandclass;

class Account{
    int acNo;
    String name;
    float amount;

    void insert(int a, String n, float amt){
        acNo=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt + " Deposited");
    }
    void withdraw(float amt){
        if (amount<amt){
            System.out.println("Insufficient Balance");
        }
        else {
            amount=amount-amt;
            System.out.println(amt + " Withdrawn");
        }
    }
    void checkBalance(){
        System.out.println("Balance is:- " + amount);
    }
    void display(){
        System.out.println(acNo + " " + name + " " + amount);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(123456, "Ankit", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}
