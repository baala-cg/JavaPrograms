package com.BasicPrograms;

import java.util.*;

class DuplicateElementsArray {
	public static void main(String[] args) {

		String[] words = { "Selenium", "UFT", "webdriverio", "UFT", "Selenium", "Selenium" };

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