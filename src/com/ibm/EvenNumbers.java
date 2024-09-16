package com.ibm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	 public static void main(String[] args) {
	        // List of integers
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        
	        // Using lambda function to filter even numbers
	        List<Integer> evenNumbers = numbers.stream()
	                                           .filter(n -> n % 2 == 0)  // Lambda expression
	                                           .collect(Collectors.toList());
	        
	        // Output the filtered list
	        System.out.println("Even Numbers: " + evenNumbers);
	    }
}
