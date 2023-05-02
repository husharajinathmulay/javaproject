package com.bridgeit.fellowship.functionalprograms;

import java.io.PrintWriter;

import com.bridgeit.fellowship.utility.Utility;

public class TwoDArray
{
	/*
	  * Purpose:The main function is written to read 2D Array and print it
	  * @author milind patil
	  * @version
	  * @since:14-11-2019
	  * 
	  **/
	public static void main(String[] args) 
	{
		
		PrintWriter out = new PrintWriter(System.out);
		System.out.println("Enter the number of rows "); 
		int row = Utility.inputInt();
		
		System.out.println("Enter the number of columns ");
		int col = Utility.inputInt();
		
		int arrInt[][] = new int[row][col];
		double arrDbl[][] = new double[row][col];
		boolean arrBln[][] = new boolean[row][col];
		
		System.out.println("Enter the integer data ");
		
		//Taking integer type array as input
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) 
			{
				arrInt[i][j]=Utility.inputInt();
			}
		}
		System.out.println();
		System.out.println("Integer type array is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				out.print(arrInt[i][j]+" ");
				
			}
			out.println();
	        out.flush();
		}
		
		//Taking double type array as input 
		System.out.println("Enter the double type data ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arrDbl[i][j]=Utility.inputDouble();
			}
		}
		System.out.println("Double type array is");

		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				out.print(arrDbl[i][j]+"\t");
			
			}
			out.println();
			out.flush();
		}
		
		//Taking boolean type array as input
		System.out.println("Enter the boolean type data ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arrBln[i][j]=Utility.inputBoolean();
			}
		}
		System.out.println("Boolean type array is");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) 
			{
				out.print(arrBln[i][j]+"\t");
				
			}
			out.println();
			out.flush();
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}

}


