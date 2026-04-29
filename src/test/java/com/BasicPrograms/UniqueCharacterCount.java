package com.BasicPrograms;


	import java.util.HashMap;
	import java.util.Map;

	public class UniqueCharacterCount {
//	    public static Map<Character, Integer> countUniqueCharacters(String str) {
		    public static void countUniqueCharacters(String str) {

	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        for (char ch : str.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }
	        System.out.println("Unique Character Counts: " + charCountMap);   

//	        return charCountMap;
	    }
	    
	    public static void main(String[] args) {
	        String input = "BalaKrishna";
//	        Map<Character, Integer> result =
	        		countUniqueCharacters(input);
	        
//	        System.out.println("Unique Character Counts: " + result);   
	        //Unique Character Counts: {a=3, B=1, r=1, s=1, h=1, i=1, K=1, l=1, n=1}

	    }
	}
