package com.BasicPrograms;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Add2Arrays {
		    public static void main(String[] args) {
		        // Define two arrays
		        Integer[] array1 = {5, 3, 8, 1};
		        Integer[] array2 = {7, 2, 6, 4};

		        // Create an ArrayList and add elements from both arrays
		        ArrayList<Integer> resultList = new ArrayList<>();
		        resultList.addAll(Arrays.asList(array1));
		        resultList.addAll(Arrays.asList(array2));

		        // Sort the ArrayList
		        Collections.sort(resultList);
		        
//		        to print reverse order
		        Collections.sort(resultList, Collections.reverseOrder());


		        // Print the sorted ArrayList
		        System.out.println("Sorted resultant array (ArrayList): " + resultList);
		    }
		

		
	}


