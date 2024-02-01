package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 3, 5, 4, 67, 78, 12, 11, 13, 15);

		List<Integer> evenlist = numbers.stream(
				).filter(e -> e % 2 == 0)
				.collect(Collectors.toList());

		System.out.println("even numbers list: " + evenlist);

		List<Integer> oddlist = numbers.stream()
				.filter(e -> e % 2 != 0)
				.collect(Collectors.toList());

		System.out.println("even numbers list: " + oddlist);
	}

}
