package com.corejava;

public class April7_VarArgsCmdArgs {

	public static void main(String[] args) {

		if(args[0].equals("chrome"))
		{
			System.out.println("runing the test cases using chrome...");
		}
		
		if(args[0].equals("firefox"))
		{
			System.out.println("runing the test cases using firefox...");
		}

	}
	
	
	//varArgsEx1(1,2);
	//varArgsEx1(1,2,3);
	//varArgsEx1(1,2,3,4);
	public static void varArgsEx1(int...x)
	{
		int sum = 0;
		for(int i=0; i<x.length;i++)
		{
			sum = sum + x[i];
		}
		System.out.println(sum);
	}
	
	
	
//	joinEmpDetails("Ramu","Kulkarni");		
//	joinEmpDetails("Ramu","Kulkarni","Pune");		
//	joinEmpDetails("Ramu","Kulkarni","Pune","India");
	public static void joinEmpDetails(String...s)
	{
		String details = "";
		
		for(String m : s)
		{
			details = details +" "+m;
		}
		
		System.out.println(details);
	}


}
