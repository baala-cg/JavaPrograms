package com.BasicPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = { 3, 4, 5, 10, 12, 1, 34, 1 };

		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length; j++) {
				if (numbers[j - 1] > numbers[j]) {
					temp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = temp;
				}
			}
		}

//		Can use any of the below to display the data
		
//		### for loop 
//		for (int k = 0; k < numbers.length; k++) {
//			System.out.println(numbers[k]);
//		}

//		### for each loop
		
//		for (int n: numbers) {
//			System.out.println(n);
//		}

		// Using lambda expression with forEach
		Arrays.stream(numbers)
//		.sorted()
		.forEach(ele -> System.out.println(ele));

	}

}
