package com.javatpoint.control_statements;

public class SwitchVowel {
    public static void main(String[] args) {
        char ch = 'o';
        switch (ch){
            case 'a' : System.out.println("Vowel"); break;  // you can add capital letter to
            case 'i' : System.out.println("Vowel"); break;
            case 'e' : System.out.println("Vowel"); break;
            case 'o' : System.out.println("Vowel"); break;
            case 'u' : System.out.println("Vowel"); break;
            default  : System.out.println("Consonant");
        }
    }
}
