package com.ibm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithCollectors {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers and collect them into a list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .collect(Collectors.toList()); // Collect into a list

        System.out.println("Even Numbers: " + evenNumbers);
    }
}

