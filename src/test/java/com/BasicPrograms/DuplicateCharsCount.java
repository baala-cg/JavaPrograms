package com.BasicPrograms;

import java.util.*;

class DuplicateCharsCount {
	public static void main(String[] args) {
		String sample = "Selenium is open source tech";

		char[] characters = sample.toCharArray();

		Map<Character, Integer> storeMap = new HashMap<>();

		for (Character c : characters) {
			Integer count = storeMap.get(c);
			if (count == null) {
				storeMap.put(c, 1);
			} else {
				storeMap.put(c, storeMap.get(c) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : storeMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Character: " + entry.getKey() + " is dispayed: " + entry.getValue() + " times");
			}
		}
	}

}