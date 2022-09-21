package com.javatpoint.polymorphism;

public class FinalMethod {
    void mNumber(){
        System.out.println("9155222544");
    }
    final void atmPIN(){ // To secure atm pin we use final
        System.out.println("1243");
    }
}
class Thief extends FinalMethod{
    @Override
    void mNumber(){
        System.out.println("9155222544");
    }
     //  @Override   we cannot override a final method
    //  void atmPIN(){
   //      System.out.println("1243");

}
class Main{
    public static void main(String[] args) {
        Thief t = new Thief();
        t.atmPIN();
        t.mNumber();
    }
}
