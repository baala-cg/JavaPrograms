package com.BasicPrograms;

class RemoveWhiteSpacesReplaceAll {
	public static void main(String[] args) {
		String orgStr = "Saket Saurav        is a QualityAna    list";

		// 1. Using replaceAll() Method

//		String modStr = orgStr.replaceAll("\\s", "");
		
		String modStr = orgStr.replaceAll(" ", "");

		System.out.println(modStr);

	}
}
