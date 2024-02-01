package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class SquareCondAverage {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 4, 3);
		double average = numbers.stream()
				.map(e -> e * e)
				.filter(e -> e >= 5)
				.mapToInt(e -> e)
				.average()
				.getAsDouble();

		System.out.println("average after squaring and applying greater than cond: " + average);
	}

}
