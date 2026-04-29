package com.BasicPrograms;

import java.util.Arrays;
import java.math.BigInteger;

public class AddReversedArrays {
	public static int[] addReversedArrays(int[] l1, int[] l2) {
	        // Reverse arrays and convert to strings
	        String num1 = new StringBuilder(arrayToString(l1)).reverse().toString();
	        String num2 = new StringBuilder(arrayToString(l2)).reverse().toString();
	        
	        // Add numbers using BigInteger
//	        BigInteger sum = new BigInteger(num1).add(new BigInteger(num2));
//	        int sum = Integer.parseInt(num2)  + Integer.parseInt(num1);
	        
			// Convert num1 string to BigInteger
			BigInteger bigInt1 = new BigInteger(num1);

			// Convert num2 string to BigInteger
			BigInteger bigInt2 = new BigInteger(num2);

			// Add the two BigInteger values
			BigInteger sum = bigInt1.add(bigInt2);


	        // Convert sum to array
	        String sumStr = sum.toString();
//	        String sumStr = String.valueOf(sum);
	        int[] result = new int[sumStr.length()];
	        for (int i = 0; i < sumStr.length(); i++) {
	            result[i] = sumStr.charAt(i) - '0';
	        }
	        
	        return result;
	    }

	private static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int num : arr)
			sb.append(num);
		return sb.toString();
	}

	public static void main(String[] args) {
		int[] l1 = { 2, 4, 1 };
		int[] l2 = { 5, 6, 4 };
		System.out.println("Output: " + Arrays.toString(addReversedArrays(l1, l2)));
	}
}
