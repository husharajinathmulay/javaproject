package com.bridgeit.fellowship.basiccoreprograms;

import com.bridgeit.fellowship.utility.Utility;
/*
 * Purpose: To print factors of given string
 * @author milind patil
 * @version 1.0
 * @since:12-11-2019
 * 
 **/
public class Factors
{
	/**
	 * print the factors of given N number
	 **/
	public static void main(String[] args) 
	{
		System.out.println("Enter the number ");
		// Taking an integer number as input
		int n = Utility.inputInt();
		while (n % 2 == 0) 
		{
			System.out.print(" "+ 2);
			n /= 2;
		}
		for (int i = 3; i * i <= n; i += 2)
		{
			while (n % i == 0) 
			{
				System.out.print(i + " ");
				n /= i;
			}
		}
	
		// Closing Scanner

		Utility.closeScanner();

	}
}
