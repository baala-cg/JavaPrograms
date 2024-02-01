package com.BasicPrograms;

public class ReverseStringBuffer {

	public static void main(String[] args) {

		String str = "Selenium is an open source";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
