package com.corejava;

public class March12_Loops {

	public static void main(String[] args) {
		
		printPattern3();
	}
	
	
	public static void nestedWhileLoop()
	{
		
		int x = 1;
		
		while( x < 10)
		{
			int y = 1;
			
			while ( y < 10)
			{
				System.out.println(" The value of x is "+x);
				System.out.println("The value of y is "+y);
				
				if ( y == 5)
				{
					break;
				}
				y++;
			}	
		
			if ( y == 5)
			{
				break;
			}
			x++;
			
						
			
			
		}
	}


	public static void forLoop1()
	{
		int a  = 10;	
		
		for(int x=0; x<=5; x++)
		{
			System.out.println("The value of x is "+x);
		}
		
		System.out.println("====================");
		
		for( int x = 5 ; x>=0; x--)
		{
			System.out.println("The value of x is "+x);
		}
		
	}

	public static void multiplicationTable()
	{		
		for( int x=1; x<=5; x++)
		{
			for ( int y=1; y<=10;y++)
			{
					System.out.println(x+" * "+y+" = "+(x*y));
			}
			System.out.println("===============================");
		}
	}

	public static void checkPrime()
	{
		boolean result = true;
		int num = 49;
		for( int x = 2; x < num; x++)
		{
			if(num % x == 0)
			{
				result = false;
				break;
			}
		}
		
		if(result)
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
	}

	public static void doWhileLoop()
	{
		/*
		int x = 1;
		
		while ( x < 1)
		{
			System.out.println("The value of x is "+x);
			x++;
		}
		System.out.println(" After the while loop");
		*/
		
		int x = 1;
		do
		{
			System.out.println("The value of x is "+x);		
			x--;
		}
		while( x > 1);
		
		System.out.println(" After the do while loop");
		
		
		
	}

	public static void forLoop2()
	{
		for(int x=1;x<=5;x++)
		{
			System.out.print("* ");
		}
	}
	
	
	public static void printPattern1()
	{
		for(int x=1;x<=5;x++)
		{
			for( int y=1 ; y<=5;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void printPattern2()
	{
		for(int x=1;x<=5;x++)
		{
			for( int y=1 ; y<=x;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
	
	public static void printPattern3()
	{
		for(int x=1;x<=5;x++)
		{
			for( int y=1 ; y<=x;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
