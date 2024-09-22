package com.BasicPrograms;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ReplaceSpaceWithSpecialChar {

	public static void main(String[] args) {
		String phrase = "Test Automation is essential these days";

		// Array of special characters to use
		char[] specialChars = { '@', '#', '£', '_', '&' };

		// StringBuilder to build the new string
		StringBuilder result = new StringBuilder();

		// Variable to keep track of which special character to use next
		int specialCharIndex = 0;

		// Iterate over each character in the string
		for (char ch : phrase.toCharArray()) {
			if (ch == ' ') {
				// Replace space with the current special character
				result.append(specialChars[specialCharIndex]);

				// Update the index to the next special character
				specialCharIndex = (specialCharIndex + 1) % specialChars.length;
			} else {
				// If not a space, just append the character as is
				result.append(ch);
			}
		}

		// Print the result
		System.out.println("Original String: " + phrase);
		System.out.println("Modified String: " + result.toString());
	}

}
