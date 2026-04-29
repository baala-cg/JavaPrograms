package com.StreamAPIPrograms;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;

import java.util.*;

public class MinMaxnumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 23, 34, 24, 67, 56, 68, 89, 1);
		Integer max = numbers.stream()
				.max(Comparator.comparing(Integer::valueOf))
				.get();
//		int cnt = numbers.size();
//		Collections.sort(numbers);
//		System.out.println("sorted list: " + numbers.get(cnt-3));
//		System.out.println("sorted list: " + numbers);

		System.out.println("max number: " + max);

		Integer min = numbers.stream()
				.min(Comparator.comparing(Integer::valueOf))   //terminal operation, returns Optional<T>, converts int to Integer
//				While this may seem redundant for a list of Integer objects, it's used to ensure the comparator works with the integer 
//				values.
				.get();
		
		System.out.println("max number: " + min);
	}

}
