package com.BasicPrograms;

import java.util.ArrayList;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started here";
		String str2 = "The rains Have started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(1));    //h
		
		System.out.println(str.indexOf('h')); //1st occurance
		
		System.out.println(str.indexOf('h', str.indexOf('h') + 1));   //2nd occurance : over loaded method - fromindex - second param

		System.out.println(str.indexOf('h', str.indexOf('h', str.indexOf('h') + 1) + 1));   //3rd occurance : over loaded method - fromindex 
		
		System.out.println(str.indexOf("have"));    //occurance of h in have word
		
		System.out.println(str.indexOf("hello"));    //-1 as hello is not available, no error
		
//		string comparision
		System.out.println(str.equals(str2));    //false
		
		System.out.println(str.equalsIgnoreCase(str2));    //true
		
//		substring:
		
		System.out.println(str.substring(0, 9));    //The rains , index 9 is excluded
		
//		trim
		String s = "         Hello World     ";
		System.out.println(s.trim());    //Hello World             returns string with spaces removed to left and right  and not in between
		System.out.println(s.replace(" ", ""));    //HelloWorld
		String trimmed = s.trim();
		System.out.println("Trimmed version:: " +trimmed);
		
		String date = "01-01-2025";
		System.out.println(date.replace("-", "/"));    //01/01/2025
		System.out.println(date.replaceAll("-", "/"));    //01/01/2025

//		split
		String test = "Hello World Test Selenium";
		String words[] = test.split(" ");
		
		for(String word : words) {
			System.out.println(word);    
		}
		
		String s1 = "Balu";
		System.out.println(s1.concat("1"));
		System.out.println("Value of s1::" + s1);    //Balu1
		String x = "Hello";
		String y = "World";
		System.out.println(x.contains("Hel"));              //true
		System.out.println(y.endsWith("rld"));            //true
		System.out.println(y.startsWith("Wor"));            //true
		System.out.println("Compare value:: " + x.compareTo(y));      //Compare value:: -15
		int a = 100;
		int b = 200;
		System.out.println(x+y+a+b);   //HelloWorld100200, compiler computes from left to right
		
		System.out.println(a+b+x+y);   //300HelloWorld
		
		System.out.println(x+y+(a+b));    //HelloWorld300
		
		char ch[] = {'j','a','v','a'};
		String s3 = new String(ch);
		System.out.println("Value of string:: " +s3);           //Value of string:: java
		
		StringBuffer sb1 = new StringBuffer("Geeks");      
		String s4 = new String(sb1);
		System.out.println("Value of string:: " +s4);             //Value of string:: Geeks
		
		String s5 = "learn share learn";
		int output = s5.lastIndexOf('a');
		System.out.println("Index value a:: " +output);    //14
		
		String s6 = "Hello";
		String lcase = s6.toLowerCase();
		String ucase = s6.toUpperCase();

		System.out.println("Value of string:: " +lcase);   //Value of string:: hello
		System.out.println("Value of string:: " +ucase);  //Value of string:: HELLO

		ArrayList<String> names = new ArrayList<>();
		names.add("Balu");
		names.add("Krishna");
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Hyd");
		cities.add("Chennai");
	
		names.addAll(cities);
		System.out.println(names);            //[Balu, Krishna, Hyd, Chennai]
		
		names.removeAll(cities);
		System.out.println(names);            //[Balu, Krishna]
		
		names.add("Annavaram");
		cities.add("Annavaram");
		
		names.retainAll(cities);                   //retains only common data
		System.out.println(names);            //[Annavaram]
		System.out.println(cities);
	}

}
