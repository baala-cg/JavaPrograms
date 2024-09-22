package com.StreamAPIPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		
//		limit:
		List<Integer> numbers = Arrays.asList(12, 23, 34, 12, 23, 1, 2, 2);
		List<Integer> first5 = numbers.stream()
				.limit(5)
				.collect(Collectors.toList());

		System.out.println("first five numbers: " + first5);

		int sum = first5.stream()
				.reduce((a, b) -> a + b)
				.get();
		System.out.println("First five numbers sum: " + sum);

//		or

		Integer first5sum = numbers.stream()
				.limit(5)
				.reduce((a, b) -> a + b)
				.get();
		System.out.println("First five numbers sum: " + first5sum);

		// skip:

		Integer sumpostskipfive = numbers.stream()
				.skip(5)
				.reduce((a, b) -> a + b)
				.get();
		System.out.println("Sum after skipping first five numbers : " + sumpostskipfive);

	}

}
