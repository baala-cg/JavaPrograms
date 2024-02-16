package com.StreamAPIPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowestNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 11, 10, 9, 56, 11, 13, 10);

		int secondLowest = numbers.stream()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		System.out.println("second lowest number: " + secondLowest);

		int secondHighest = numbers.stream()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println("second highest number: " + secondHighest);

	}

}
