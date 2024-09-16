package com.ibm;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an odd number N: ");
		int N = scanner.nextInt();
		if (N % 2 == 0) {
			System.out.println("N must be an odd number.");
			
		}
		for (int i = 1; i <= N; i++) {
			int num = (i <= N / 2 + 1) ? i : N - i + 1;
			int spaces = N - 2 * num;
			System.out.print(" ".repeat(num - 1));
			System.out.print(num);
			if (spaces > 0)
				System.out.print(" ".repeat(spaces) + num);
			System.out.println();
		}
		scanner.close();
	}
}
