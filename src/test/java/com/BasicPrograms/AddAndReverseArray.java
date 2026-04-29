package com.BasicPrograms;

import java.util.Arrays;
import java.math.BigInteger;

public class AddAndReverseArray {
	public static int[] addAndReverse(int[] l1, int[] l2) {
		// Convert arrays to strings
		String num1 = "";
		String num2 = "";
		for (int digit : l1)
			num1 += digit;
		for (int digit : l2)
			num2 += digit;
		
		// Add numbers using BigInteger
//		Short form of below 3 statements
//		BigInteger sum = new BigInteger(num1).add(new BigInteger(num2));
		
		
		// Convert num1 string to BigInteger
		BigInteger bigInt1 = new BigInteger(num1);

		// Convert num2 string to BigInteger
		BigInteger bigInt2 = new BigInteger(num2);

		// Add the two BigInteger values
		BigInteger sum = bigInt1.add(bigInt2);

		// Convert sum to reversed array
		String sumStr = new StringBuilder(sum.toString()).reverse().toString();
		int[] result = new int[sumStr.length()];

		for (int i = 0; i < sumStr.length(); i++) {
			result[i] = sumStr.charAt(i) - '0';
		}

		return result;
	}

	public static void main(String[] args) {
		int[] l1 = { 9, 9, 9, 9, 9, 9, 9 };
		int[] l2 = { 9, 9, 9, 9 };
		System.out.println("Output: " + Arrays.toString(addAndReverse(l1, l2)));
	}
}
