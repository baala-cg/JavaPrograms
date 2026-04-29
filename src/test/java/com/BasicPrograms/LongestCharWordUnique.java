package com.BasicPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestCharWordUnique {

	public static void main(String[] args) {

		        String[] words = {"apple", "banana", "strawberry", "kiwi", "banana"};

		        // Find the word with the most characters
		        String longestWord = findLongestWord(words);

		        // Remove duplicate characters from the longest word
		        String uniqueCharsWord = removeDuplicateChars(longestWord);

		        System.out.println("Longest word: " + longestWord);
		        System.out.println("Word with unique characters: " + uniqueCharsWord);
		    }

		    // Method to find the longest word in the array
		    public static String findLongestWord(String[] words) {
		        String longest = "";
		        for (String word : words) {
		            if (word.length() > longest.length()) {
		                longest = word;
		            }
		        }
		        return longest;
		    }

		    public static String removeDuplicateChars(String word) {
		        Set<Character> uniqueChars = new LinkedHashSet<>();
		        char[] ch = word.toCharArray();
		        
		        for (char c : ch) {
		            uniqueChars.add(c);
		        }
		        
		        StringBuilder result = new StringBuilder();
		        for (char c : uniqueChars) {
		            result.append(c);
		        }

		        return result.toString();
		    }
	
	}


