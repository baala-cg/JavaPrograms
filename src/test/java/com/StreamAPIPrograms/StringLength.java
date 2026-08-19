package com.StreamAPIPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class StringLength {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bala Krishna", "aaaaabbb", "Balu");

        List<Integer> sorted = names.stream()
//                .map(String::length)
                .map(s -> s.length())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.print("sorted: " + sorted);

    }

}

