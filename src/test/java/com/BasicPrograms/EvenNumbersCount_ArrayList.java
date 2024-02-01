// Online Java Compiler
// Run Java code without any setup
package com.BasicPrograms;

import java.util.*;

class EvenNumbersCount_ArrayList {
	public static void main(String[] args) {
		int[] numbers = { 12, 34, 9, 34, 12, 1, 11, 23, 36 };
		int evenCount = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
				evenCount++;
			}

		}
		System.out.println("Even count: " + evenCount);

	}

}