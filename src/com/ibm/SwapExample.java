package com.ibm;

import java.util.Scanner;

public class SwapExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int a = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int b = scanner.nextInt();

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		// Swap logic
		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping: a = " + a + ", b = " + b);

		scanner.close();
	}
}
