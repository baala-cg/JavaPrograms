package com.BasicPrograms;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Factorial {

	public static void main(String[] args) {
		
		int number = fact(4);
		System.out.println(number);
		
		
	}

	public static int fact(int num) {
		if(num == 0) {
			return 1;
		} else {
			return num * fact(num-1);
		}
		
	}
}
