package com.BasicPrograms;

public class SwapItems {

	public static void main(String[] args) {

//		Integers
//		int a = 5;
//		int b = 10;
//
//		a = a + b;
//		b = a - b; // 5
//		a = a - b; // 10

//		Strings

		String a = "Hello";
		String b = "World";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length()); // it will pick from 5 to end of the string

		System.out.println("a:: " + a);
		System.out.println("b:: " + b);

	}

}
