package com.BasicPrograms;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

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






class FindPairs {

    public static void main(String[] args) {

        int[] arr = {6, 11, 11, 6, 7, 18};
        int target = 17;

        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

//                    int first = Math.min(i, j);
//                    int second = Math.max(i, j);

                    pairs.add("(" + i + ", " + j + ")");
                }
            }
        }

        System.out.println(pairs);
    }
}





class FindPairs1 {

    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 3, 6, 7, 7, 2, 5};
        int target = 9;

        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    int first = Math.min(i, j);
                    int second = Math.max(i, j );

                    pairs.add("(" + first + ", " + second + ")");
                }
            }
        }

        System.out.println(pairs);
    }
}