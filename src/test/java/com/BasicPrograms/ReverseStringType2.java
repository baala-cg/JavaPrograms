package com.BasicPrograms;

public class ReverseStringType2 {

	public static void main(String[] args) {

		String str = "Selenium is an open source";
		String revStr = "";

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				revStr = revStr + words[i].charAt((words[i].length() - 1) - j);
			}
			revStr = revStr + " ";
		}

		System.out.println("Reversed string in type two format is: " + revStr);

	}

}
