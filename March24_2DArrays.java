package com.corejava;

import java.util.Arrays;
import java.util.Random;

public class March24_2DArrays {

	public static void main(String[] args) throws InterruptedException {

		/*
		char[] c = {'a','b','c'};		
		Arrays.sort(c);		
		System.out.println(Arrays.binarySearch(c,'b'));
		
		int[] x = {20,14,18,8,2,50};
		
		System.out.println(Arrays.toString(sortIntArray(new int[] {20,14,18,8,2,50})));
		
		// Its possible to create an array with zero Length... ( 0 is considered as +ve integer )
		int[] y = new int[0];		
		System.out.println(y.length);
		 */
		
		//twoDimArrayEx2();
		
		String[] s = {"java","bhava","mava"};
		
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
		
		
	}

	public static int[] sortIntArray(int[] x)
	{
		
		for( int i = 0; i<x.length ; i++)
		{
			for(int j=i+1; j<x.length;j++)
			{
				int  temp = 0;
				
				if(x[j] < x[i] )
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		//return new int[] {1,2,3,4};
		
		return x;
		
	}

	public static void twoDimArrayEx1()
	{
		int[][] x  = new int[3][3];		
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;
		
		x[1][0] = 40;
		x[1][1] = 50;
		x[1][2] = 60;
		
		x[2][0] = 70;
		x[2][1] = 80;
		x[2][2] = 90;		
		System.out.println(x.length);
		///System.out.println(x[0].length);
		
		for ( int i = 0 ; i < x.length;i++)
		{
			for( int j = 0; j < x[i].length;j++)
			{
				System.out.print(x[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

	public static void twoDimArrayEx2() throws InterruptedException
	{
		int[][] x  = new int[3][];
		
		 x[0] = new int[4];
		 x[1] = new int[3];
		 x[2] = new int[5];
		 
		 // 2 D array in one line
		 
		 int[][] y = {{10,20,30,40},{10,20,30},{10,20,30,40,50}};
		 
		 for( int i = 0; i<y.length;i++)
		 {
			 for(int j=0; j<y[i].length;j++)
			 {
				 System.out.print(y[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 
		 int[] n = {10,20,30,40,50};
		 
		/*	 
		 for( int i=0;i<x.length;i++)
		 {
			 for(int j=0;j<x[i].length;j++)
			 {
				 int  m = (int) System.currentTimeMillis();			 
				 Thread.sleep(2000);
				 x[i][j] =  m;				 
			 }
		 }
		 
		 
		 
		 System.out.println("===========================");
		
		 for( int i=0;i<x.length;i++)
		 {
			 for(int j=0;j<x[i].length;j++)
			 {
				 int  m = (int) System.currentTimeMillis();
				 System.out.print(x[i][j]+" ");
			 }
			 System.out.println();
		 }
		 */
	}


}
