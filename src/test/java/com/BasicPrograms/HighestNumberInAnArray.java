package com.BasicPrograms;

public class HighestNumberInAnArray {
	public static void main(String[] args) {
		int arr[] = { 12,100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		System.out.println("Largest Number from method is: " + getLargest(arr));
		int largest = 0;
		int secondLargest = 0;
		int temp = 0;
		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				temp = largest;
				largest = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println("Largest Number is: " + largest);
	}
	
	public static int getLargest(int[] num) {
		int largenumber = 0;
		for(int i = 1 ; i < num.length; i++) {
			if(num[i] > largenumber) {
				largenumber = num[i];
			}
		}
		
		return largenumber;
	}
}
