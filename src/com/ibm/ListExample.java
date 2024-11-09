package com.ibm;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Initializing a List with some elements
        List<String> items = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));

        // Adding elements
        items.add("Mango");
        items.add(1, "Grapes");  // Insert at specific index

        // Accessing elements
        System.out.println("First item: " + items.get(0));
        
        // Updating an element
        items.set(2, "Pineapple");  // Replaces "Banana" with "Pineapple"
        
        // Removing elements
        items.remove("Apple");
        items.remove(1);  // Removes item at index 1

        // Iterating through list
        System.out.println("Items in list:");
        for (String item : items) {
            System.out.println(item);
        }

        // Sorting the list
        Collections.sort(items);

        // Printing sorted list
        System.out.println("Sorted items: " + items);
    }
}
