package com.StreamAPIPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxnumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 23, 34, 24, 67, 56, 68, 89, 1);
		int max = numbers.stream()
				.max(Comparator.comparing(Integer::valueOf))
				.get();

		System.out.println("max number: " + max);

		int min = numbers.stream()
				.min(Comparator.comparing(Integer::valueOf))
				.get();

		System.out.println("max number: " + min);
	}

}
