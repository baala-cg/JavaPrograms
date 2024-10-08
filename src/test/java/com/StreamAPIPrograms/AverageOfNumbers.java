package com.StreamAPIPrograms;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		double average = numbers.stream()
				.mapToInt(ele -> ele)
				.average()
				.getAsDouble();

		System.out.println("average of numbers: " + average);
	}

}
