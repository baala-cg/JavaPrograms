package com.BasicPrograms;

import java.util.Scanner;

public class Palindrome_String {
    public static void main (String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        for (int i =0; i<length; i++) {
            reverse = reverse + original.charAt(length-1-i);
        }
        System.out.println("reverse is:" +reverse);
         
        if(original.equals(reverse)) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
         
    }
}
