package com.corejava;

public class March8_CoreJava {

	public static void main(String[] args) {

		conditionalOperator();
		
		/*
		char c = 'a';
		char c1 = 'b';
		double d = 10.50;		
		System.out.println(c+d);
		*/
	}
	
	public static void assignmentOperators()
	{
		// Simple assignment
		int x = 20;
		
		int y; // Declaration
		y = 100; // Initialization
		
		// Chained assignment		
		int a,b,c,d;		
		a=b=c=d=100;
		
		// int p=q=r=200; //// not allowed
		
		
		// Compound assignment
		
		int m = 100;		
		m += 50; // m =  m + 50;
		
		System.out.println(m);
		
		m -= 25;
		
		System.out.println(m);
		
		m *= 2;
		
		System.out.println(m);
		
		m /= 50;
		
		System.out.println(m);
		
		m %= 5;
		
		
		System.out.println(m);
		
		
		
		
		
		
		
		
		
		
	}

	
	public static void arithmeticOperators()
	{
		int x = 10;		
		int y = (x+100);
	
		System.out.println(250+500);
		
		System.out.println(x-5);
		
		System.out.println(10*10);
		
		System.out.println(x/5);
		
		System.out.println(x%2);
		
	}

	public static void relationalOperators()
	{
		int x = 10;
		int y = 5;
		
		boolean result = (x > y);
		
		System.out.println(result);
		
		System.out.println(x >= 10);
		
		System.out.println( y < x);
		
		System.out.println(y <= 4);
		
		
		
		
	}

	public static void equalityOperators()
	{
		int x = 10;
		
		int y = 5;
		
		System.out.println(x == y);
		
		System.out.println(x != y);
		
		String s = "Selenium";
		
		String s1 = "java";
		
		System.out.println(s.equals(s1));
				
				
		
	}

	public static void conditionalOperator()
	{
		int a = 100;
		int b = 200;
		
		//boolean c = ( a > b) ? false:true;
		
		System.out.println(( a > b) ? 50:1000);
				
	}

	public static void inifinityOperator()
	{
		int x = -100;
		
		// System.out.println(100/0); // Arithmetic Exception ( / by zero)
		
		double y = 0.0;
		
		double  z = x/y;  // ( Infinity or - Infinity)
		
		System.out.println(z);
		
	
		
	}

	public static void naNExample()
	{
		System.out.println(0/0.0);		
		System.out.println(0.0/0);
	}

	public static void concatinationExample()
	{
		int x = 20;
		int y = 50;
		
		String s = "java";
		String s1 = "bhava";
		
		String s4 = "s";
		String s5 = "x";
		
		
		
		String s2 = (s+x);
		
		String s3 = (s1+s2);
		
		System.out.println(s2);
		
		System.out.println(s3);
		
		System.out.println(x+y);
		
		System.out.println(x+y);
	
	}

}
