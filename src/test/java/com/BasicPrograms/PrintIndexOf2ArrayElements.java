package com.BasicPrograms;

import java.util.*;

public class PrintIndexOf2ArrayElements {

    public static void main(String[] args) {
        int[] arr = {6, 11, 11, 6, 7, 18};
        int target = 17;

        findAllPairsWithSum(arr, target);
    }

    public static void findAllPairsWithSum(int[] arr, int target) {

        // Map: value -> list of indices (to handle duplicates)
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            // If complement exists, print all its previous indices
            if (map.containsKey(complement)) {
                for (int index : map.get(complement)) {
                    System.out.println("Pair found at indices: " + index + " and " + i);
                }
            }

            // Store current index in list (handle duplicates safely)
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }
    }
}