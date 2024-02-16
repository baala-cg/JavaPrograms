package com.StreamAPIPrograms;


	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class EvenNumbers_Streams {

	    public static void main(String[] args) {
	        // Create a list of numbers
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Using filter to get even numbers
	        List<Integer> evenNumbers = numbers.stream()
	                                           .filter(n -> n % 2 == 0)
//	                                           .map(n -> n * n)           -- we can use map here as well
	                                           .collect(Collectors.toList());

	        // Using map to square each even number
	        List<Integer> squaredEvenNumbers = evenNumbers.stream()
	                                                      .map(n -> n * n)
	                                                      .collect(Collectors.toList());

	        // Print the results
	        System.out.println("Original numbers: " + numbers);
	        System.out.println("Even numbers: " + evenNumbers);
	        System.out.println("Squared even numbers: " + squaredEvenNumbers);
	    }
	}


