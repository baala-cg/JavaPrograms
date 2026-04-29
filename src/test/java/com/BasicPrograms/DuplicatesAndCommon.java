package com.BasicPrograms;

import java.util.Set;
import java.util.*;

public class DuplicatesAndCommon {

	public static void main(String[] args) {

//		Use a Map to track occurrences of elements in each array to find duplicates.
//		Use a Set to find common elements between the arrays.
		int[] array1 = { 1, 2, 3, 4, 2, 5, 6, 3 };
		int[] array2 = { 3, 4, 4, 5, 6, 7, 3, 8 };

		Set<Integer> duplicates1 = findDuplicates(array1);
		Set<Integer> duplicates2 = findDuplicates(array2);

		Set<Integer> commonValues = findCommonValues(array1, array2);

		System.out.println("Duplicates in array1: " + duplicates1);
		System.out.println("Duplicates in array2: " + duplicates2);

		if (!commonValues.isEmpty()) {
			System.out.println("Common values in both arrays: " + commonValues);
		} else {
			System.out.println("No common values found.");
		}
	}

	private static Set<Integer> findDuplicates(int[] array) {
		Map<Integer, Integer> countMap = new HashMap<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int num : array) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
			if (countMap.get(num) > 1) {
				duplicates.add(num);
			}
		}
		return duplicates;
	}

	private static Set<Integer> findCommonValues(int[] array1, int[] array2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> common = new HashSet<>();

		for (int num : array1) {
			set1.add(num);
		}

		for (int num : array2) {
			if (set1.contains(num)) {
				common.add(num);
			}
		}
		return common;
	}

	/*
	 * Duplicates in array1: [2, 3] Duplicates in array2: [3, 4] Common values in
	 * both arrays: [3, 4, 5, 6]
	 */

}
