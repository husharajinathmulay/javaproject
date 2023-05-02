package com.bridgeit.fellowship.junit;

import com.bridgeit.fellowship.utility.Utility;
/*
* purpose:   Temperature Conversion.
* 
* @author Milind Patil
* @version 1.0
* @since 15-11-2019
* */
public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter the temperature and units ");
		double tmptr = Utility.inputDouble();
		String unit = Utility.inputString();
		double tc = Util.temperatureConversion(tmptr, unit);
		System.out.println(tc);
		   Utility.closeScanner();

	}


}
