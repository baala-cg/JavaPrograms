package com.BasicPrograms;

public class SeparateNumbersAlphaSplChars {

	public static void main(String[] args) {

		String s = "AutomatN332423&(*&JHJb";

		String splChars = s.replaceAll("[0-9a-zA-Z]", "");
		String withoutSplChars = s.replaceAll("[^0-9a-zA-Z]", "");
		String cap = withoutSplChars.replaceAll("[a-z0-9]", "");
		String small = withoutSplChars.replaceAll("[A-Z0-9]", "");
		String numbers = withoutSplChars.replaceAll("[a-zA-Z]", "");

		System.out.println("Special Character:: " + splChars);
		System.out.println("Capital Alphabets:: " + cap);
		System.out.println("Small Alphabets:: " + small);
		System.out.println("Numbers:: " + numbers);
	}

}
