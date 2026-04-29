package com.BasicPrograms;

import java.util.Arrays;

//	Add a given integer number to a number represented as an array of digits.

public class IncrementArray {
	public static int[] addNumber(int[] digits, int num) {
		int number = 0;
		for (int digit : digits) {
			number = number * 10 + digit;
		}
		number += num;

//	        String numberStr = Integer.toString(number);
		String numberStr = String.valueOf(number);

		int[] result = new int[numberStr.length()];

		for (int i = 0; i < numberStr.length(); i++) {
			result[i] = numberStr.charAt(i) - '0';
		}
		return result;
	}

	public static void main(String[] args) {
		int[] digits = { 15 };
		int num = 2;
		System.out.println("Output: " + Arrays.toString(addNumber(digits, num)));
	}
}
