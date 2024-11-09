package com.ibm;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Initializing a Map with some key-value pairs
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);

        // Adding and updating key-value pairs
        ages.put("Diana", 32); // Adds new entry
        ages.put("Alice", 26); // Updates Alice's age

        // Accessing values by key
        System.out.println("Alice's age: " + ages.get("Alice"));

        // Removing a key-value pair
        ages.remove("Bob");

        // Checking if a key or value exists
        System.out.println("Contains Charlie? " + ages.containsKey("Charlie"));
        System.out.println("Contains age 32? " + ages.containsValue(32));

        // Iterating through keys and values
        System.out.println("Ages in the map:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Getting all keys and values as separate collections
        System.out.println("All names: " + ages.keySet());
        System.out.println("All ages: " + ages.values());
    }
}
