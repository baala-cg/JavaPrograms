package com.BasicPrograms;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SpyNumber {

	public static void main(String[] args) {
		int number = 4211;
		int org_num = number;

		int sum = 0, product = 1;

		while (number > 0) {
			sum += number % 10;
			product *= number % 10;
			number /= 10;
		}

		if (sum == product) {
			System.out.println(org_num + ": is spy number");
		} else {
			System.out.println(org_num + ": is NOT spy number");
		}
	}

}
