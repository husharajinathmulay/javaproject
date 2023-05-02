package com.bridgeit.fellowship.junit;

import com.bridgeit.fellowship.utility.Utility;
/*
* purpose:   To convert to binary , then to nibbles and to to decimal
* 
* @author Milind Patil
* @version 1.0
* @since 15-11-2019
* */
public class BinaryNibbles {
public static void main(String[] args) {
	String s = new String();
		System.out.println("Enter the decimal number");
		int n=Utility.inputInt();
		System.out.println("Binary number is  ");

		 s=Util.decToBin(n); 
		 System.out.println("Nibbles");
		  Util.toSwapNibbles(s);
		 //System.out.println(str);
	     System.out.println("Decimal number is  ");
		System.out.println(Util.toDecimal(s));
		Utility.closeScanner();
		

	   
	}
}
