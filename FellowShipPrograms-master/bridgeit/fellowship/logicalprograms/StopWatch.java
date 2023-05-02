package com.bridgeit.fellowship.logicalprograms;

import com.bridgeit.fellowship.utility.Utility;

/*
* purpose:   To print result of stopwatch 
* 
* @author Milind Patil
* @version 1.0
* @since 15-11-2019
* */
public class StopWatch
{
	public static void main(String[] args) 
	{
		long time1 = 0, time2 = 0; 

		System.out.println("Enter any string to start time");

		Utility.inputString(); 

		time1 = System.currentTimeMillis();

		System.out.println("Press the \"Enter\" the key to end time");

		 Utility.inputString();

		time2 = System.currentTimeMillis();

		// store difference between time1 and time2
		
		long millisec = time2 - time1;

		System.out.println("The time between start and end is: " + millisec / 1000 + " seconds.");
	}

}
