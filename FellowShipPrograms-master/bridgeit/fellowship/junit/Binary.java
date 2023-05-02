package com.bridgeit.fellowship.junit;


import com.bridgeit.fellowship.utility.Utility;
/*
* purpose:   To convert Decimal to Binary
* 
* @author Milind Patil
* @version 1.0
* @since 15-11-2019
* */
public class Binary {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the decimal number");
		int n=Utility.inputInt();
		Util.decToBin(n);  
		Utility.closeScanner();
	   
	}
}