package com.ibm;

//import java.util.ArrayList;
//
//public class MissedLectures {
//    
//    public static void main(String[] args) {
//        int b = 4; // Sample input value
//        int e = 5; // Sample input value
//        
//        int result = countMissedLectures(b, e);
//        System.out.println("Missed Count: " + result); // Sample output
//    }
//
//    public static int countMissedLectures(int b, int e) {
//        ArrayList<Integer> classes = new ArrayList<>();
//        int numChapters = e; // Assuming numChapters is e for this example
//        
//        for (int i = 1; i <= numChapters; i++) {
//            classes.add(i);
//        }
//        
//        ArrayList<Integer> rangeClasses = new ArrayList<>(classes.subList(b, e + 1));
//        
//        long missedCount = rangeClasses.stream().distinct().count();
//        
//        return (int) missedCount;
//    }
//}
import java.util.ArrayList;

public class MissedLectures {
    
    public static void main(String[] args) {
        int b = 5; // Sample input value
        int e = 6; // Sample input value
        
        int result = countMissedLectures(b, e);
        System.out.println("Missed Count: " + result); // Sample output
    }

    public static int countMissedLectures(int b, int e) {
        ArrayList<Integer> classes = new ArrayList<>();
        int numChapters = e; // Assuming numChapters is e for this example
        
        for (int i = 1; i <= numChapters; i++) {
            classes.add(i);
        }
        
        // Adjust the ending index to ensure it stays within bounds
        int endIndex = Math.min(e + 1, classes.size());
        ArrayList<Integer> rangeClasses = new ArrayList<>(classes.subList(b, endIndex));
        
        long missedCount = rangeClasses.stream().distinct().count();
        
        return (int) missedCount;
    }
}
