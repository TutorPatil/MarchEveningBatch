package com.corejava;

public class April14_WrapperClassesAndRecurssion {

	public static void main(String[] args) {		
		System.out.println(findFactorial(5));
	}	
	
	public static void printNumbersDesc(int num)
	{
		System.out.print(num+" ");
		if(num >0)   // base case
			printNumbersDesc(num-1);
	}
	
	public static void printNumbersAsc(int num)
	{
		if(num >0)   // base case
			printNumbersAsc(num-1);
		
		System.out.print(num+" ");
		
	}
	
	public static int findFactorial(int num)
	{
		if ( num == 1)  // base case
			return 1;
		
		return (num * findFactorial(num-1));
		
		
	}
	
	/*
		int x = 20;
		
		Integer xObj = new Integer(x);  // Boxing or wrapping
		
		System.out.println(xObj.doubleValue());
		
		System.out.println(xObj.SIZE);
		
		System.out.println(xObj.TYPE);
		
		int y = xObj.intValue();  // Un boxing or unWrapping....
		
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		
		String s = "1234";
		
		int y1 = Integer.parseInt(s);
		
		System.out.println(y1+100);
		
		System.out.println("==================");
		
		char c = 'A';
		
		Character c1 = new Character(c); // Boxing
		
		c1.charValue(); // Unboxing
		
		System.out.println(c1.toString().length());
		
		System.out.println(Character.getNumericValue(c));
		
		
		double d = 100.25;
		Double d1 = new Double(d);
		
		System.out.println(d1.intValue());
		
		
		Integer m =  25; // Auto Boxing..	
		int n = m;  // Unboxing...
		
	*/	
		
		
		
		
		
		
		
		

	

}
