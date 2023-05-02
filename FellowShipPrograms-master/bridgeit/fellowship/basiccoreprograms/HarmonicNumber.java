package com.bridgeit.fellowship.basiccoreprograms;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To print harmonic number
* 
* @author Milind Patil
* @version 1.0
* since: 12-11-2019
* */
public class HarmonicNumber 
{
	
	/**
	  * The main function is written to print the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
	  **/
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number ");
		int n=Utility.inputInt();
		double res=0.0;
		int i=0;
		for(i=1;i<=n;i++)
		{
			res=res+(double)1/i;
			System.out.print("1/"+i+"  +  ");
		}
		System.out.println();
		System.out.println("Nth Harmonic value is " + res);
		Utility.closeScanner();
	}
}