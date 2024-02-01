package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates_Streams {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 12, 12, 10, 13, 13, 34, 45);

		List<Integer> unique = numbers.stream()
				.distinct()
				.collect(Collectors.toList());

		System.out.println("unique array: " + unique);

		System.out.println("Count: " + unique.size());

	}

}
