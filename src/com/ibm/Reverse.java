package com.ibm;

public class Reverse {

	public static void main(String[] args) {
		 String or= "madam";
		 String rev="";
		 
		 //int lenght=or.length();
		 
		 for(int i=or.length()-1;i>=0;i--) {
			 rev=rev+or.charAt(i);
			 
		 }
		 if(rev.equals(or)) {
			 System.out.println(or+" is palinderome");

		 }else {
			 System.out.println(or+" is not palinderome");
		 }
	}
}
