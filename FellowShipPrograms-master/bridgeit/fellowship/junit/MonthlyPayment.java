package com.bridgeit.fellowship.junit;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To calculate monthly-payment. 
* @author Milind Patil
* @version 1.0
* since: 15-11-2019
* */
public class MonthlyPayment 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the principal");
		double p = Utility.inputDouble();
		
		System.out.println("Enter year");
		int y = Utility.inputInt();
		
		System.out.println("Enter Interest");
		double r = Utility.inputDouble();
		
		//call to Util class static method
		
		double payment = Util.monthlyPayment(p, y, r);
		System.out.println("Payment is " + payment);
		Utility.closeScanner();
	}

}