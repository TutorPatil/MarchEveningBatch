package com.corejava;

public class March10_ConditionalStatement {

	public static void main(String[] args) {
		
		findFactorial();

	}

	public static void ifElseIfExample1()
	{
		int month = 30;
		
		if(month == 1 )
		{
			System.out.println("You are born in  Jan..");
			
		}
		else if(month == 2)
		{
			System.out.println("You are born in  Feb..");
		}
		else if ( month == 3) {
			System.out.println("You are born in  March..");
		}
		else
		{
			System.out.println(" Please enter correct month .....");
		}
		
		System.out.println("After all the if and else...");
		
	}
	
	
	public static void swithcExample1()
	{
		int month = 3;
		
		switch(month)
		{
		
		case 1:
		{
			System.out.println("This month has 31 days");
			break;
			
		}
		case 2:
		{
			System.out.println("This month has 28 or 29 days");
			break;
			
		}
		case 3:
		{
			System.out.println("This month has 31 days");			
			break;
		}
		case 4:
		{
			System.out.println("This month has 30 days");
			break;
		}
		default:
		{
			System.out.println("Please  enter the valid value for month...");
			break;
		}	
		
		}
		System.out.println("After the switch....");
		
		
	}
	
	
	
	
	public static void swithcExample2()
	{
		int month = 3;
		
		switch(month)
		{
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			System.out.println("This month has 31 days");
			break;
			
		}
		case 4:
		case 6:
		case 9:
		case 11:
		{
			System.out.println("This month has 30 days");
			break;
			
		}
		case 2:
		{
			System.out.println("This month has 28 or 29 days");
			break;
			
		}		
		default:
		{
			System.out.println("Please  enter the valid value for month...");
			break;
		}	
		
		}
		System.out.println("After the switch....");
		
		
	}
	
	public static void swithcExample3()
	{
		String browser = "firefox";
		
		switch(browser)
		{
		
		case "chrome":
		{
			System.out.println(" Running  the test cases using chrome  browser,,,");
			break;
		}
		case "firefox" :
		{
			System.out.println(" Running  the test cases using firefox  browser,,,");
			break;
		}
		
		default:
		{
			System.out.println("Browser is not supported...");
		}	
		
		}
		System.out.println("After the switch....");
		
		
	}
	
	public static void whileLoopEx1()
	{
		int x = 1;
		
		while(x <= 5 )
		{
			System.out.println("The value of x is "+x);
			x++;
		}
		
		System.out.println(" after the while loop");
	}
	
	public static void whileLoopEx2()
	{
		int x = 5;
		
		while(x >= 1 )
		{
			System.out.println("The value of x is "+x);
			
			if ( x == 3)
			{
				break;
			}
			x--;
		}
		
		System.out.println(" after the while loop");
	}

	public static void printMultiTable()
	{
		
		int x = 1;		
		
		
		while ( x <= 5)
		{
			int y = 1;	
			while ( y <= 10)
			{
				System.out.println(x+" * "+y+" = "+(x*y));
				y++;
			}
			System.out.println("======================\n");
			x++;
		}
		
	}

	public static void findFactorial()
	{
		int num = 5;
		int fact = 1;
		
		while ( num > 1)
		{
			fact = (fact * num);
			num--;
		}
		
		System.out.println(fact);
	}
}


