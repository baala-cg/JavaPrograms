package com.BasicPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordHashSet {

	public static void main(String[] args) {

		String names[] = {"Selenum", "wdio","playwright", "cypress","wdio", "cypress"};
		
		Set<String> set = new HashSet<>();
		
		for(String name : names) {
			if(set.add(name) == false) {
				System.out.println("Duplicate elements:: " + name);			}
		}
	}

}
