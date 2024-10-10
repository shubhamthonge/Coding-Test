package com.ibm;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        
        // Test the predicate
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7)); // false
    }
}
