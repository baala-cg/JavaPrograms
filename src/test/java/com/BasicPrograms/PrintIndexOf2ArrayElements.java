package com.BasicPrograms;

import java.util.HashMap;

public class PrintIndexOf2ArrayElements {

	public static void main(String[] args) {
		int[] arr = { 6, 11, 11, 6, 7, 18 };
		int target = 17;

		// Call the function to find all pairs with the target sum
		findAllPairsWithSum(arr, target);
	}

	public static void findAllPairsWithSum(int[] arr, int target) {
		// Create a HashMap to store the elements and their indices
		HashMap<Integer, Integer> map = new HashMap<>();

		// Loop through the array to find all matching pairs
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i]; // Calculate the complement of the current element

			// If the complement is already in the map, we found a pair
			if (map.containsKey(complement)) {
				// Print the indices of the two elements whose sum equals the target
				System.out.println("Pair found at indices: " + map.get(complement) + " and " + i);
			}

			// Store the current element and its index in the map
			map.put(arr[i], i);
		}
	}
}
