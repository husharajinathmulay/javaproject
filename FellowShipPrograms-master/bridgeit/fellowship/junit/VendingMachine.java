package com.bridgeit.fellowship.junit;

import com.bridgeit.fellowship.utility.Utility;

public class VendingMachine {

	/*
	* purpose:   To design vending machine
	* 
	* @author Milind Patil
	* @version 1.0
	* @since 15-11-2019
	* */
	public static void main(String[] args) {
		
		int arr[]= {2000,1000,500,200,100,50,5,2,1};
		int i=0,temp=0,sum=0;
		System.out.println("Enter amount");
		int value=Utility.inputInt();
		
		while(0<value)
		{
			temp=(value/arr[i]);
			sum=sum+(arr[i]*temp);
			if(temp!=0)
			System.out.println(arr[i]+"*"+temp+"= "+sum);
			value=value%arr[i];
			i++;
		}
		System.out.println("Total Amount= "+sum);
		   Utility.closeScanner();

	}
}
