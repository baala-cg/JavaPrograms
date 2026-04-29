package com.BasicPrograms;

import java.util.*;

public class SequenceGenNSearch {

	public static void main(String[] args) {

		/*
		 * For the team offsite, there is a draft where you can win a price if your
		 * number is picked first. The game uses two integers x, y to generate a
		 * sequence. Given two integers x and y, construct an infinite sequence of
		 * integers A ={a0, a1, …} as follows: a0 = 0 and for every i >= 1,
		 * a(2i-1)=a(2i-2) + x and a(2i) = a(2i-1) - y.
		 */
//		For example, if x=2, y=1 and z=3, then A=(0,2,1,3,2,4,3,…) and the answer is 3 (a(3)=3 and this is the first 
//		occurrence of 3 in A). If x=2, y=0 and z=3, then A=(0,2,2,4,4,6,6,…) and the answer is -1 (there is no occurrence of 3 in A).

		int x = 2;
		int y = 1;
		int target = 3;

		int[] seq1 = genSeq(2, 1);
		System.out.println(Arrays.toString(seq1));

		int ind1 = getIndex(seq1, target);
		System.out.println(ind1);

		int[] seq2 = genSeq(2, 0);
		System.out.println(Arrays.toString(seq2));

		int ind2 = getIndex(seq2, target);
		System.out.println(ind2);

	}

	public static int[] genSeq(int x, int y) {
		int arr[] = new int[10];
		arr[0] = 0;
		for (int i = 1; i < 5; i++) {
			arr[2 * i - 1] = arr[2 * i - 2] + x;
			arr[2 * i] = arr[2 * i - 1] - y;
		}
		return arr;
	}

	public static int getIndex(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
