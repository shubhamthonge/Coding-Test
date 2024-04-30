package com.ibm;

public class Singleton{

	private static Singleton singleton;

	
	
	private Singleton(Singleton singleton) {
		super();
		this.singleton = singleton;
	}
	

	private Singleton() {
		super();
		System.out.println("Singleton constructor");
		// TODO Auto-generated constructor stub
	}


	public static Singleton obj () {
		if (singleton == null ) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	public static void main(String[] args) {
		
		//obj();
		System.out.println(obj());
		System.out.println(obj());
		System.out.println(obj());
		System.out.println(obj());
		Singleton s= new Singleton();
		
	}
	
}
