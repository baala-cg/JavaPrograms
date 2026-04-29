package com.BasicPrograms;

import java.util.Arrays;
//Shift even number to left and odd numbers to right side in array
public class ShiftEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3}; // Example array
        shiftEvenOdd(arr);
        System.out.println("Array after shifting: " + Arrays.toString(arr));
    }

    public static void shiftEvenOdd(int[] arr) {
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        int evenIndex = 0, oddIndex = 0;

        // Separate even and odd numbers into two arrays
        for (int num : arr) {
            if (num % 2 == 0) {
                even[evenIndex++] = num;
            } else {
                odd[oddIndex++] = num;
            }
        }

        // Merge even and odd arrays back into the original array
        int index = 0;
        for (int i = 0; i < evenIndex; i++) {
            arr[index++] = even[i];
        }
        for (int i = 0; i < oddIndex; i++) {
            arr[index++] = odd[i];
        }
    }
}
