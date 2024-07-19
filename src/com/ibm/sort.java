package com.ibm;


import java.util.ArrayList;
import java.util.Arrays;

public class sort {
	
	public static <E> void main(String[] args) {
		 int b= 0x2AF2;
		int []a = {11,22,33,55,77,99,88,66,44,};
		Arrays.sort(a);
		System.out.println("2 higst element ="+ a[a.length-2]);
		System.out.println(b);
		
		ArrayList<String> p=new ArrayList<>();
		p.add("shubham3");
		p.add("shubham1");
		p.add("shubham2");
		System.out.println(p.size());
	}
}
