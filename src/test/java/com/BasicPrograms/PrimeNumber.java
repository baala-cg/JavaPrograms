package com.BasicPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 11;
//		to print all the number till number provided
		printPrimeNumbers(num);
//		to check whether the number is prime number or not
		if (isPrimeNumber(num)) {
			System.out.println("Its a prime numer:: " + num);
		} else {
			System.out.println("Its not a prime numer:: " + num);
		}
	}

	public static void printPrimeNumbers(int num) {
		System.out.println("Its a prime numer:: " );
		for (int i = 2; i < num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" );
	}

	public static boolean isPrimeNumber(int num) {
		if (num < 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
}
