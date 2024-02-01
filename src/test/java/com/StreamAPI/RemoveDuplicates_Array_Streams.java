package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates_Array_Streams {
	public static void main(String[] args) {
		Integer numbers[] = { 10, 10, 20, 30, 12, 20 };

		List<Integer> unique = Arrays.stream(numbers)
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Distinct numbers are: " + unique.size());

		for (int n : unique) {
			System.out.println(n);
		}

	}
}
