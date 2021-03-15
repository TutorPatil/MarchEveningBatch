package com.corejava;

public class March15_CoreJava {

	public static void main(String[] args) {
		/*
		int a = 100;
		int b  = 120;
		
		int sum = addNumbers3(200, 100);
		
		
		
		System.out.println(sum);
		
		//double d = 20;
		//System.out.println(d);
		
		*/
		
	    //String fullName = 	joinNameAndSurName("Ramu", "Kulkarni");
		
		//String fullName = 	joinNameAndAge("Ramu", 16);
	
		//System.out.println(fullName);
		
		//System.out.println(checkEvenOrOdd(20));
		
		
		//System.out.println(findFactorial(8));
		
		//System.out.println(checkPrime(13));
		
		for ( int x=3; x<100; x++)
		{
			boolean result = checkPrime(x);
			if( result)
			{
				System.out.println(x);
			}
		}
	}
	
	public static void addNumbers()
	{
		int a = 10;
		int b = 20;
		
		int sum ;
		
		sum = ( a + b);
		
		System.out.println(sum);
	}
	
	public static void addNumbers1(int a, int b)
	{
		int sum = ( a + b);
		
		System.out.println(sum);
	}
	
	public static void addNumbers2(double a, int b)
	{
		double sum = ( a + b);
		
		System.out.println(sum);
	}

	
	public static int addNumbers3(int a, int b)
	{
		int sum = ( a+b);
		return sum;
	}

	public static String joinNameAndSurName(String name, String surName)
	{
		String fullName = (name +" "+  surName );
		
		return fullName;
	}
	
	public static String joinNameAndAge(String name, int age)
	{
		String str = "";
		 str = name + age;
		return str;
	}
	
	
	//	System.out.println(checkEvenOrOdd(20));
	public static boolean checkEvenOrOdd(int num)
	{
		boolean  result  = false;
		
		if( num % 2 == 0)
		{
			result = true;
		}
		else
		{
			result  = false;
		}
		
		
		return result;
	}
	
	public static int findFactorial(int num)
	{
		int fact = 1;
		
		while ( num > 1)
		{
			fact = (fact * num);
			num--;
		}
		
		return fact;
	}

	
	//System.out.println(checkPrime(13));
	public static boolean checkPrime(int num)
	{
		
		int x = 2;		
		
		boolean isPrime = true;
		
		while ( x < num)
		{
			if( num % x == 0)
			{
				isPrime = false;
				break;
			}			
			x++;
		}
		
		return isPrime;
		
	}
}
