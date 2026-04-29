package com.BasicPrograms;

class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String withoutSpace = "";
		String sample = "Saket Saurav        is an Autom ation Engi ne      er";

		char[] chars = sample.toCharArray();

		StringBuffer result = new StringBuffer();

		for (int i = 0; i < chars.length; i++) {
			if ((chars[i] != ' ')) {
				result.append(chars[i]);
				withoutSpace = result.toString();
			}
		}
		System.out.println(withoutSpace); // Output : SaketSauravisanAutomationEngineer
	}
}
