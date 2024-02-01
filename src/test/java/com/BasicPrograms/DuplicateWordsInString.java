package com.BasicPrograms;

import java.util.*;

public class DuplicateWordsInString {

	// Online Java Compiler
	// Run Java code without any setup

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket Saket";

		String[] words = str.split(" ");

		Map<String, Integer> storeMap = new HashMap<>();

		for (String word : words) {
			Integer count = storeMap.get(word);
			if (count == null) {
				storeMap.put(word, 1);
			} else {
				storeMap.put(word, storeMap.get(word) + 1);
			}

		}

		for (Map.Entry<String, Integer> entry : storeMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Word: " + entry.getKey() + " is displayed: " + entry.getValue() + " times");
			}
		}

	}

}