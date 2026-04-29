package com.BasicPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int arms = 0;
		int r = 0;

		while (num > 0) {
			r = num % 10;
			arms += r * r * r;
			num /= 10;
		}

		if (temp == arms) {
			System.out.println("Its an arm strong number:: " + temp);
		} else {
			System.out.println("Its not an arm strong number:: " + temp);
		}
	}

}
