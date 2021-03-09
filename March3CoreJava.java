package com.corejava;

public class March3CoreJava {
	
	 static int age = 16;	 
	 static int x = 100;
	

	public static void main(String[] args) {
		
		System.out.println("Inside the main method...");
		
		//System.out.println(Sample.salalry); // private members cant be accessed out side of the class
		
		Sample.test1();
		
		// Variable declaration
		final int x;
		
		// Initialiation 
		x = 20;
		
		// x = 30; // final variables cant take different values
		
		System.out.println("The value of x is "+x);
		
		String name = "Ramu";
		
		System.out.println("your name is "+name);
		
		age = 20;
		
		testMethod();
		
		// int x = 20; // Both in one line
		
		//System.out.println(x+10);
		
		/*
		System.out.println(age);
		
		age = 20;
		
		testMethod();
		
		System.out.println("Ending  the main method...");
		*/
	}
	
	public static void testMethod()
	{
		int x = 50;
 		System.out.println("Inside the test Method");
		
		int y = 100;
		
		int z = ( x + y );
		
		String s = "java"+"selenium";
		
		
		
		System.out.println(z);
		
		System.out.println(age);
		
		System.out.println("Ending the test method...");
		
		System.out.println(x);
	}

}
