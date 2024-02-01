package com.BasicPrograms;

public class FibanocciSeries {

	public static void main(String[] args) {

		int a = 0, b = 1, c;
		int count = 10;
		System.out.print("Fibanocci Series: " + a + " " + b + " ");
		for (int i = 0; i < count; i++) {

			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

}
