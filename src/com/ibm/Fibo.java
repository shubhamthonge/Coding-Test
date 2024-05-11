package com.ibm;

public class fibo {
	
	public static String rev(String in) {
		String s="";
		for(int i=0;i<in.length();i++) {
			s=in.charAt(i)+s;
			//System.out.println(s);
		}
		
		return s;
	}
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		for(int j=0;j<10;j++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println(rev("raj"));
	}

}
