package com.BasicPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		long num = 123456789;
		long rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /=   10;
		}
		System.out.println("Reversed number is :" + rev);

	}
}
//		approach 2:
/*
 * String c_num = String.valueOf(num); StringBuffer sb = new
 * StringBuffer(c_num);
 */

//		System.out.println("Reversed number is :" + sb.reverse());
/*
 * }
 * 
 * }
 */
