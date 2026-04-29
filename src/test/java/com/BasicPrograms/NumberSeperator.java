package com.BasicPrograms;

// Input String :  a2c45d23

// Output :
// Total Integers : 3 
// integers are 2 , 45, 23 

import java.util.*;

public class NumberSeperator {
	public static void main(String[] args) {
		String sample = "b577b765r767o767";

		char ch[] = sample.toCharArray();
		StringBuffer result = new StringBuffer();

		for (char c : ch) {
			if (isInteger(c)) {
				result.append(c);
			} else {
				result.append(' ');
			}
		}

		String modSample = result.toString().trim();
		String words[] = modSample.split(" ");

		System.out.println("Count:: " + words.length);
		for (String word : words) {
			System.out.print(word + " ");
		}
	}

	public static boolean isInteger(char c) {
		return "0123456789".indexOf(c) != -1;
	}
}
