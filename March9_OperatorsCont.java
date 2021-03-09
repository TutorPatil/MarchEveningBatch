package com.corejava;

public class March9_OperatorsCont {

	public static void main(String[] args) {
		biggestOf3Numbers_1();
	}
	
	public static void ifElseExample1()
	{
		int x = 10;
		int y = 5;
		
		if ( (x > y)  &&  ( x > 5))
		{
			System.out.println(" x is bigger than y ");
		}
		System.out.println("after the if block...");
		
		String s = "selenium";
		
		if (s.length() == 10)
		{
			System.out.println(" The string has required no of characters");
		}
		
	}
	
	
	public static void ifElseExample2()
	{
		int x = 10;
		int y = 50;
		
		if  (x > y) 
		{
			System.out.println(" x is greater than y ");
		}
		else
		{
			System.out.println(" Y is greater than x");
		}
		System.out.println(" After the if else....");
			
	}
	
	public static void incrementDecrement()
	{
		int x = 10;
		
		int y = x--;
		
		System.out.println(x);
		System.out.println(y);
		
		
		
	}

	
	public static void biggestOf3Numbers()
	{
		
		int a = 100;
		int b = 15;
		int c = 50;

			if(a > b)
			{
				if ( a > c )
				{
					System.out.println(" a is the biggest...");
				}
				else
				{
					System.out.println(" c is the biggest...");
				}
			}
			else
			{
				if ( b > c)
				{
					System.out.println(" b is the biggest...");
				}
				else
				{
					System.out.println(" c is the biggest...");
				}
			}
}
	
	
	public static void biggestOf3Numbers_1()
	{
		
		int a = 100;
		int b = 15;
		int c = 50;

		if (( a > b) && ( a > c ))
		{
			System.out.println(" a is the biggest...");
		}
		if((b > a) && (b > c))
		{
			System.out.println(" b is the biggest...");
		}
		
		if ((c > a ) && (c > b))
		{
			System.out.println(" C is the biggest...");
		}
		
}
	
	public static void logicalOperators()
	{
		int x = 10;
		int y = 5;
		
		System.out.println(((x < y ) || (y < 3 )) && ( x==10));
		
		//System.out.println(!false);
		
	}
}
