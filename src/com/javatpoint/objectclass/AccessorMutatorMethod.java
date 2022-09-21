package com.javatpoint.objectclass;

class Student3{
    private int roll = 100;
    private String name = "Ankit";
    public int getRoll(){  // accessor method
        return roll;
    }
    public void setRoll(){  // mutator method
        this.roll=roll;
    }
    public String getName(){  // accessor method
        return name;
    }
    public void setName(){  // mutator method
        this.name=name;
    }
    public void display(){
        System.out.println("Roll no:- " + roll);
        System.out.println("Student Name:- " + name);
    }
}

public class AccessorMutatorMethod {
    public static void main(String[] args) {
        Student3 student3 = new Student3();
        student3.display();
        student3.setName();
        student3.getName();
        student3.setRoll();
        student3.getRoll();

    }

}
