package com.javatpoint.objectclass;

public class ThisKeyword1 {
    void show(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        ThisKeyword1 thisKeyword1 = new ThisKeyword1();
        System.out.println(thisKeyword1);
        thisKeyword1.show();
    }
}
