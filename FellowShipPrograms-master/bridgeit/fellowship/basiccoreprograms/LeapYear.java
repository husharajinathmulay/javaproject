package com.bridgeit.fellowship.basiccoreprograms;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To check year is leaf or not. 
* 
* @author Milind Patil
* @version 1.0
* since: 12-11-2019
* */
public class LeapYear {

	
	/**
	  * The main function is written to Check whether year is leap year or not
	  **/
	
	public static void main(String[] args)
	{
		int count=0;
		System.out.println("Enter the year ");
		

		
		int year=Utility.inputInt();
				
		int temp=year;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		
		//Validating whether year is of four digit or not 
		
		if(count<4) {
			System.out.println("Enter Year in four digit ");
		}
		else if(Utility.isLeap(year))  {
			System.out.println(year + " is Leap Year ");
		}
		else {
			System.out.println(year + " is not Leap Year ");
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}
	
	/**
	 * Purpose : Check whether a year is leap or not
	 * @param year : Passes year as an argument 
	 * @return true if year is leap else false 
	 */
	


}
