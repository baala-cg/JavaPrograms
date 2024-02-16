package com.StreamAPIPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 4, 5, 6, 7);
		Optional<Integer> sum = numbers.stream()
				.reduce((a, b) -> a + b);

		System.out.println("sum of numbers: " + sum.get());
	}

}
