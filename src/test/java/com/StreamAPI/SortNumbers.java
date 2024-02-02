package com.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 34, 56, 12, 11, 10, 34, -12, -9);
		List<Integer> sortedList = numbers.stream()
				.sorted()
				.collect(Collectors.toList());

		System.out.println("sorted list: " + sortedList);

		List<Integer> sortedDescList = numbers.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		System.out.println("sorted list: " + sortedDescList);

	}

}
