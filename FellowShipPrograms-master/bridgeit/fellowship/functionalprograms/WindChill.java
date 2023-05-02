package com.bridgeit.fellowship.functionalprograms;

import com.bridgeit.fellowship.utility.Utility;

/**
 *  Purpose: Takes two  command-line arguments t and v and prints the wind chill.  
 *  @author  Milind Patil
 *  @version 1.0
 *  @since   14-11-2019
 *
 **/
public class WindChill {

	public static void main(String[] args) {
	
		System.out.println("Enter The Value of Temperature ");
		int t = Utility.inputInt();
		System.out.println("Enter The Value of Wind Speed ");
		double v = Utility.inputInt();
		if(t>50||v>120||v<3) {
			System.out.println("Formulla is not valid ");
		}else {
			double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
			System.out.println("w = " + w);
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}

}


