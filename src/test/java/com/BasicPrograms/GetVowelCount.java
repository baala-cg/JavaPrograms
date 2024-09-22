package com.BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class GetVowelCount {

	public static void main(String[] args) {

		String phrase = "Test Automation is essential these days";

		// Convert the string to lowercase to handle case insensitivity
		phrase = phrase.toLowerCase();

		// Create a map to store the count of each vowel
		Map<Character, Integer> cntMap = new HashMap<>();

		// Iterate over each character in the string
		for (char ch : phrase.toCharArray()) {
			if (isVowel(ch)) {
				// If the character is a vowel, update its count in the map
//		            	cntMap.put(ch, cntMap.getOrDefault(ch, 0) + 1);

				Integer count = cntMap.get(ch);
				if (count == null) {
					cntMap.put(ch, 1);
				} else {
					cntMap.put(ch, cntMap.get(ch) + 1);
				}

			}
		}

		// Print the vowels and their counts
		for (Map.Entry<Character, Integer> entry : cntMap.entrySet()) {
			System.out.println("Vowel: " + entry.getKey() + " | Count: " + entry.getValue());
		}
	}

	// Helper method to check if a character is a vowel
	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
