package com.BasicPrograms;

public class MissingNumber {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 5, 6 };
		int arrSum = 0, seqSum = 0;

		for (int i = 0; i < num.length; i++) {
			arrSum = arrSum + num[i];
		}

		for (int j = 1; j <= num.length + 1; j++) {
			seqSum = seqSum + j;
		}

		System.out.println("Missing number is: " + (seqSum - arrSum));

	}

}
