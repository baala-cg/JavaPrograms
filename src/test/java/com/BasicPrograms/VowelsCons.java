package com.BasicPrograms;


//move the vowels to left in each word of a sentence

public class VowelsCons {
	public static void main(String[] args) {
		String input = "Sample run";
		String output = alignVowelsAndConsonants(input);
		System.out.println(output);
	}

	public static String alignVowelsAndConsonants(String input) {
		StringBuilder result = new StringBuilder();
		String[] words = input.split(" ");

		for (String word : words) {		
			StringBuilder vowels = new StringBuilder();
			StringBuilder consonants = new StringBuilder();

			for (char ch : word.toCharArray()) {
				if (isVowel(ch)) {
					vowels.append(ch);
				} else {
					consonants.append(ch);
				}
			}
			result.append(vowels).append(consonants).append(" ");
		}

		return result.toString().trim();
	}

	private static boolean isVowel(char ch) {
//		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
		return "AEIOUaeiou".indexOf(ch) != -1;
	}
}
