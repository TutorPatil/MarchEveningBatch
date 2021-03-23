package com.corejava;

import java.util.Arrays;

public class March23_ArraysSession2 {

	public static void main(String[] args) {
		
//		String[] str = {"java","selenium","Automation"};
//		String s = "Testing";
//		
//		boolean result = searchForElementInArray1(str, s);
//		System.out.println(result);
//		
		
//		int[] x = {1,2,3,4,5};
//		int i = 30;
//		
//		System.out.println(searchELemntInIntArray(x,i));
		
		/*
		int[] x= {20,15,8,7,18,25,100,1};
		
		int[] y = sortIntArray(x);
		
		for( int m : y)
		{
			System.out.print(m+" ");
		}
		*/
		
		/*
		 
		 // Converting an array to String
		  	  
		int[] x= {20,15,8,7,18,25,100,1};
		System.out.println(Arrays.toString(x));
		
		int[] y = sortIntArray(x);
		
		String s = Arrays.toString(y);
		System.out.println(s);
	*/
		
		int[] x= {20,15,8,7,18,25,100,1};
		
		Arrays.sort(x);
		
		System.out.println(Arrays.toString(x));
		
		System.out.println(Arrays.binarySearch(x, 25));
		
		
	}
	
	public static int[] sortIntArray(int[] x)
	{
		
		for( int i = 0; i<x.length ; i++)
		{
			for(int j=i+1; j<x.length;j++)
			{
				int  temp = 0;
				
				if(x[j] > x[i] )
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		return x;
		
	}
	
	public static boolean searchELemntInIntArray(int[] x , int i)
	{
		boolean isPresent = false;
		
		for( int m : x)
		{
			if(  m == i)
			{
				isPresent = true;
				break;
			}
		}
		
		return isPresent;
	}
	
	public static boolean searchForElementInArray1(String[]  str, String s)
	{
		boolean isPresnet = false;
		
		for( int i=0; i<str.length;i++)
		{
			if(str[i].equals(s))
			{
				isPresnet = true;
				break;
			}
		}
		
		
		return isPresnet;
	}
	
	public static void searchForElementInArray()
	{
		String[] str = {"java","selenium","Automation"};
		for( int i=0; i<str.length;i++)
		{
			if(str[i].equals("Automation"))
			{
				System.out.println("The required string is present in the array");
			}
		}
		
	}
	
	public static void arrayExample1()
	{
		/*
		final String s = "java";
		
		s = "Automation";
		
		final int x = 50;
		
		x = 25;
		*/
		final String s = "java";
		
		final String[] str = {s,"selenium","Automation"};
		str[0] = "Automation";
		
		String[] str1 = {"testing","database","devops"};
		
		//str = str1;
		
		//str[1] = "python";
		
		for(String m : str)
		{
			System.out.println(m);
		}
		
	}

}
