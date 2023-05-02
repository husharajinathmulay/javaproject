package com.bridgeit.fellowship.junit;

import com.bridgeit.fellowship.utility.Utility;
/*
* purpose:   Print DayOfWeek.
* 
* @author Milind Patil
* @version 1.0
* @since 15-11-2019
* */
public class DayOfWeek {
	public static void main(String[] args) 
	{
	  System.out.println("Enter date ");
	  int dd=Utility.inputInt();
	  System.out.println("Enter month ");
	  int mm=Utility.inputInt();
	  System.out.println("Enter year ");
	  int yy=Utility.inputInt();
	   int ch=Util.dayOfWeek(dd, mm, yy);
	   switch(ch)
	   {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursay");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		}
	   Utility.closeScanner();
	}

}
