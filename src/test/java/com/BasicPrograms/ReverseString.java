package com.BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Bala Krishna is a good guy";
		String revStr = "";

		for (int i = 0; i < str.length(); i++) {
			revStr = revStr + str.charAt((str.length() - 1) - i);
		}
		System.out.println("Reversed string is :" + revStr);
	}

}
