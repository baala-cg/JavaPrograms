package com.StreamAPIPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(33, 23, 25, 26, 18, 19, 24, 25, 25, 33);

		//		Approach - 1

		Set<Integer> dupNum = numbers.stream().filter(e -> Collections.frequency(numbers, e) > 1)
				.collect(Collectors.toSet());

		System.out.println("duplicate numbers are: " + dupNum);

//		Approach - 2

		Set<Integer> set = new HashSet<>();
		Set<Integer> dupNum2 = numbers.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());

		System.out.println("duplicate numbers are: " + dupNum2);

	}

}
