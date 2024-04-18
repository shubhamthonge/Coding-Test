package com.ibm;

public class Summation {

    public static int seqSummation(int i, int j, int k) {
        int sum = 0;

        // Sum from 1 to j
        for (int x = i; x <= j; ++x) {
            sum += x;
        }

        // Sum from j-1 down to k
        for (int x = j - 1; x >= k; --x) {
            sum += x;
        }

        return sum;
    }

    public static void main(String[] args) {
        int result = seqSummation(1, 5, -1);
        System.out.println("Output: " + result);
    }
}
