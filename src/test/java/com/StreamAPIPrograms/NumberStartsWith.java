package com.StreamAPIPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 34, 36, 38);
		
		List<Integer> numberstartswith3 = numbers.stream()
//				.map(e -> String.valueOf(e))
				.map(String::valueOf)
				.filter(e -> e.startsWith("3"))
				.map(e -> Integer.parseInt(e))
//		.map(Integer::valueOf)          can be used instead of above statement to convert String to Integer
				.collect(Collectors.toList());

		System.out.println("numbers starting with 3 : " + numberstartswith3);

	}

}
