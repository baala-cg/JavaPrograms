package com.BasicPrograms;

//public class LongestCommonPrefix {

//
//	public static void main(String[] args) {
//		String[] sampleArr = { "flower", "flow", "flight" };
//		String result = findLongestCommonPrefix(sampleArr);
//		System.out.println("Longest Common Prefix: " + result);
//	}
//
//	public static String findLongestCommonPrefix(String[] sampleArr) {
//		if (sampleArr == null || sampleArr.length == 0) {
//			return "";
//		}
//
//		String prefix = sampleArr[0];
////		System.out.println(prefix);
//		for (int i = 1; i < sampleArr.length; i++) {
//			while (sampleArr[i].indexOf(prefix) != 0) {
////				System.out.println(sampleArr[i]);
//				prefix = prefix.substring(0, prefix.length() - 1);
//				if (prefix.isEmpty()) {
//					return "No common prefix found";
//				}
//			}
//		}
//		return prefix;
//	}
//
//}

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] sampleArr = { "flower", "flow", "flight" };
		String result = findLongestCommonPrefix(sampleArr);
		System.out.println("Longest Common Prefix: " + result);
	}

	public static String findLongestCommonPrefix(String[] arr) {

		if (arr == null || arr.length == 0) {
			return "";
		}

		String first = arr[0];

		for (int i = 0; i < first.length(); i++) {
			char ch = first.charAt(i);

			for (int j = 1; j < arr.length; j++) {

				boolean cond1 = i >= arr[j].length();
				boolean cond2 = arr[j].charAt(i) != ch;
				if (cond1 || cond2) {
					return first.substring(0, i);
				}
			}
		}

		return first;
	}
}
