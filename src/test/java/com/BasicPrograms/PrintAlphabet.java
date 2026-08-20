package com.BasicPrograms;

public class PrintAlphabet {
    public static void main(String[] args) {

        String s = "a12b2c6";

        String[] parts = s.split("(?=[a-zA-Z])");

        for (String part : parts) {

            char ch = part.charAt(0);
            int count = Integer.parseInt(part.substring(1));
//    Using Java 8
            for (int i = 0; i < count; i++) {
                System.out.print(ch);
            }

//            Using Java 11 or more
//            System.out.print(String.valueOf(ch).repeat(count));

        }
    }
}

