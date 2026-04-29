package com.BasicPrograms;

import java.util.HashMap;

public class RomantoIntConversion {
	    
	    // Method to convert Roman numeral to Integer
	    public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
//	        romanMap.put('L', 50);
//	        romanMap.put('C', 100);
//	        romanMap.put('D', 500);
//	        romanMap.put('M', 1000);

	        int total = 0;
	        int prevValue = 0;
	        
	        for (int i = 0; i < s.length()  ; i++) {
	            int currentValue = romanMap.get(s.charAt(s.length() - 1-i));
	            if (currentValue < prevValue) {
	                total -= currentValue;
	            } else {
	                total += currentValue;
	            }
	            prevValue = currentValue;
	        }
	        return total;
	    }
	    
	    // Method to convert Integer to Roman numeral
	    public static String intToRoman(int num) {
	        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        
	        StringBuilder result = new StringBuilder();
	        
	        for (int i = 0; i < values.length; i++) {
	            while (num >= values[i]) {
	                num -= values[i];
	                result.append(romans[i]);
	            }
	        }
	        return result.toString();
	    }
	    
	    public static void main(String[] args) {
	        // Test cases
	        String roman = "IV";
	        int number = 58;
	        
	        System.out.println("Roman to Integer: " + roman + " -> " + romanToInt(roman));
	        System.out.println("Integer to Roman: " + number + " -> " + intToRoman(number));
	    }
	}



