package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To store and  print calendar by 2D Array.
* 
* @author Milind Patil
* @version 1.0
* since: 20-11-2019
* */

public class Calendar 
{
  public static void main(String[] args)
  {
	System.out.println("Enter month");
	int month=Utility.inputInt();
	System.out.println("Enter year");
	int year=Utility.inputInt();
	String calender[][]= Utility.createCalendar(month,year);	// return two-D array
	
	for(int i=0;i<7;i++)
	{
		for(int j=0;j<7;j++)
		{
			System.out.print("\t"+calender[i][j]);
		}
		System.out.println();
	}
	

  }


}
