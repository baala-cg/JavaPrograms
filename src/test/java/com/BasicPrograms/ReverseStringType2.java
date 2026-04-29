package com.BasicPrograms;

public class ReverseStringType2 {

	public static void main(String[] args) {
//		Appraoch -1 
		/*
		 * String str = "Selenium is an open source"; String revStr = "";
		 * 
		 * String[] words = str.split(" "); String tempWord = "";
		 * 
		 * for (int i = 0; i < words.length; i++) { tempWord = words[i]; for (int j = 0;
		 * j < tempWord.length(); j++) { revStr = revStr +
		 * tempWord.charAt((tempWord.length() - 1) - j); } revStr = revStr + " "; }
		 * System.out.println("Reversed string in type two format is: " + revStr);
		 */

//		Approach - 2

		// Example input string
		String input = "Hello World from Java";

		// Call the method to reverse each word
		String result = reverseWords(input);

		// Print the output
		System.out.println(result);
	}

	/**
	 * This method reverses each word in the input string while preserving the word
	 * order.
	 * 
	 * @param input The input string.
	 * @return A string with each word reversed.
	 */
	public static String reverseWords(String input) {
		// Split the input string on whitespace
		String[] words = input.split(" ");

		// Use a StringBuilder to accumulate the final output
		StringBuilder reversedSentence = new StringBuilder();

		// Process each word individually
		for (int i = 0; i < words.length; i++) {
			// Reverse the characters of the word
			String reversedWord = new StringBuilder(words[i]).reverse().toString();

			// Append the reversed word to the result
			reversedSentence.append(reversedWord).append(" ");

			// Append a space if this is not the last word
			/*
			 * if (i < words.length - 1) { reversedSentence.append(" "); }
			 */
		}

		// Return the final string
		return reversedSentence.toString().trim();
	}
}
