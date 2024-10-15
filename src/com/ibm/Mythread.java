package com.ibm;

public class Mythread extends Thread {

	    public void run() {
	        System.out.println("Thread is running using Thread class...");
	    }

	    public static void main(String[] args) {
	        Mythread t1 = new Mythread();
	        t1.start();  // Start the thread
	    }
	}


