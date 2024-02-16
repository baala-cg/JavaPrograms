package com.StreamAPIPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase_Streams{

		public static void main(String[] args) {
			List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date");

			// Using Stream API to convert each string to uppercase
			List<String> uppercasedList = stringList.stream()
					.map(String::toUpperCase)
					.collect(Collectors.toList());

			// Print the result
			System.out.println("Original list: " + stringList);
			System.out.println("Uppercased list: " + uppercasedList);
		}
	}


