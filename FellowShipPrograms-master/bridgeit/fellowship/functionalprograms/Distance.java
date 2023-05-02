package com.bridgeit.fellowship.functionalprograms;
/*
*
* purpose:  To find distance from one origin to another. 
* 
* @author Milind Patil
* @version 1.0
* since: 14-11-2019
* */
public class Distance {
	
		public static void main(String[] args) {
			System.out.println("Enter the vlue of x and y origin");
			double  x = Double.parseDouble(args[0]);
			double  y = Double.parseDouble(args[1]);
			//Calculating the distance from one coordinate to another coordinate
			double d = Math.sqrt(x*x + y*y);
			System.out.println("The Distance From Point (" + x + "," + y + ") to Origin (0,0) is " + d);
			
		
	}

}
