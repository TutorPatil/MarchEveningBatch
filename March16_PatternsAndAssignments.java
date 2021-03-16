package com.corejava;

public class March16_PatternsAndAssignments {

	public static void main(String[] args) {
		
		System.out.println(biggestOf2Nums(200,30));
		
		//System.out.println(joinNameAndSalary("Ramu", 15000.50));
		
		//febSeries(10);
		/*
		 * for ( int x =1; x<=100; x++) { boolean isEven = checkNumEven(x); if( isEven)
		 * { System.out.print(x+" "); } }
		 */
	}	
	public static void printEvenNumbers1To100()
	{
		for( int x=1 ; x<=100; x++)
		{
			if( x % 2 == 0)
			{
				System.out.print(x+" ");
			}
		}
	}
	
	public static boolean checkNumEven(int num)
	{
		boolean result = false;
		
		if( num % 2 == 0) {
			result = true;
		}
		else
		{
			result = false;
		}
		
		return result;
		
	}
	
	
	public static void febSeries(int num)
	{
		int fn = 0;
		int sn = 1;		
		int sum = (fn + sn);	
		
		
		for(int i=0 ; i<=num; i++)
		{
			
			if( fn == 0)
			{
				System.out.print(fn+", ");
				System.out.print(sn+", ");
				
			}
			
			System.out.print(sum+", ");
			
			fn=sn;
			sn=sum;
			sum=(fn + sn);
			
			
			
			
		}
	}
	
	
	public static String joinNameAndSalary(String name, double sal)
	{
		String str = "";
		
		str = (name+" "+sal);
		
		return str;
		
	}

	public static int biggestOf2Nums(int x, int y)
	{
		int big = 0;
		
		if( x > y )
		{
			big =x;
		}
		else
		{
			big =y;
		}
		
		return big;
	}








}
