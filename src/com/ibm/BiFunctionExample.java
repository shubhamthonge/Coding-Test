package com.ibm;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // BiFunction to add two numbers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        
        // Apply the BiFunction
        System.out.println(add.apply(10, 20)); // 30
        System.out.println(add.apply(15, 25)); // 40
    }
}
