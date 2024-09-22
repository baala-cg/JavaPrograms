package com.BasicPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ArrayListToHashMap {
    public static void main(String[] args) {
        // Create two ArrayLists: one for Integer keys and one for String values
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        // Adding values to both lists
        integerList.add(10);
        integerList.add(5);
        integerList.add(15);
        integerList.add(7);

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Create a HashMap to store Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add elements from the ArrayLists into the HashMap
        for (int i = 0; i < integerList.size(); i++) {
            hashMap.put(integerList.get(i), stringList.get(i));
        }

        // Sort the HashMap based on keys using TreeMap (which sorts by key)
        TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);

        // Display the sorted map
        System.out.println("Sorted HashMap based on Integer keys: " + sortedMap);

        // Get the highest key and its value
        Integer highestKey = sortedMap.lastKey();
        String highestValue = sortedMap.get(highestKey);
        
        Integer lowestKey = sortedMap.firstKey();
        String lowestValue = sortedMap.get(lowestKey);

        // Display the highest key and its corresponding value
        System.out.println("Highest key: " + highestKey + ", Corresponding value: " + highestValue);
        System.out.println("Lowest key: " + lowestKey + ", Corresponding value: " + lowestValue);

    }
}
