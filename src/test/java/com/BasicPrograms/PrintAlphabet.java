package com.BasicPrograms;

public class PrintAlphabet {

    public static void main(String[] args) {

        String str = "a5b3c10";

        int i = 0;

        while (i < str.length()) {

            char ch = str.charAt(i);
            i++;

            StringBuilder number = new StringBuilder();

            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                number.append(str.charAt(i));
                i++;
            }

            int count = Integer.parseInt(number.toString());

            for (int j = 0; j < count; j++) {
                System.out.print(ch);
            }
        }
    }
}

