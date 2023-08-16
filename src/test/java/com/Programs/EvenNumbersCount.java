package com.Programs;

import java.util.Scanner;

public class EvenNumbersCount {

	public static void main(String args[]) {

		int size;
		int evenCount = 0;
		System.out.println("\n Please enter the size of the elements:");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		int a[] = new int[size];

		System.out.println("\n Please enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.print("Even numbers are: ");

		for (int j = 0; j < size; j++) {
			if (a[j] % 2 == 0) {
				System.out.print(a[j] + " ");
				evenCount++;
			}
		}

		System.out.println("\n Count of even numbers " + evenCount);

	}

}
