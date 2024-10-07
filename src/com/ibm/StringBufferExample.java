package com.ibm;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append text to the buffer
        sb.append(" World");

        // Insert text at a specified index
        sb.insert(5, ",");

        // Replace a portion of the string
        sb.replace(6, 11, " Java");

        // Delete characters from the buffer
        sb.delete(0, 5);

        // Reverse the string
        sb.reverse();

        // Print the final result
        System.out.println(sb);
    }
}
