package com.ibm;
import java.util.Arrays;

public class Example {
    public void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        Arrays.asList("Hello", "World").forEach(obj::print);
    }
}
