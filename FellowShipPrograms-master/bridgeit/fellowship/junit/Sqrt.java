package com.bridgeit.fellowship.junit;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To calculate Square root . 
* @author Milind Patil
* @version 1.0
* since: 15-11-2019
* */
public class Sqrt 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number ");
		double x = Utility.inputInt();
		double s = Util.sqrt(x);
		System.out.println(s);

	}

}