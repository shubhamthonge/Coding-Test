package com.ibm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort {
	
	public static void main(String[] args) {
		
		int []a = {11,22,33,55,77,99,88,66,44,};
		Arrays.sort(a);
		System.out.println("2 higst element ="+ a[a.length-2]);
	}
}
