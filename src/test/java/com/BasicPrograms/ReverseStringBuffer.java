
package com.BasicPrograms;

public class ReverseStringBuffer {

	public static void main(String[] args) {

		String sample = "Selenium is an open source";
		StringBuffer result = new StringBuffer(sample);
		String rev = result.reverse().toString();
		System.out.println(rev);
	}

}
