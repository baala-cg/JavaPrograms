package com.BasicPrograms;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		String str = "*&^**&*(gjhjcedABCFRDEebckje22678229781271897";
		String newStr = str.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(newStr);	}

}
