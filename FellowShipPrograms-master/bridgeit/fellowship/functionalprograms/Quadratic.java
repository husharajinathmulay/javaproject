package com.bridgeit.fellowship.functionalprograms;

import com.bridgeit.fellowship.utility.Utility;

/**
 *  Purpose: find the roots of the equation a*x*x + b*x + c
 *
 *  @author  Milind Patil
 *  @version 1.0
 *  @since   14-11-2019
 *
 **/

public class Quadratic {

	public static void main(String[] args) {
		
		System.out.println("Enter The Value of a ");
		double a = Utility.inputDouble();
		System.out.println("Enter The Value of b ");
		double b = Utility.inputDouble();
		System.out.println("Enter The Value of c ");
		double c = Utility.inputDouble();
		double delta = b*b - 4*a*c;
		double root1,root2;
		if(delta > 0){
			System.out.println("Roots are real and unequal");
		    root1 = ( - b + Math.sqrt(delta))/(2*a);
		    root2 = (-b - Math.sqrt(delta))/(2*a);
		    System.out.println("First root is:"+root1);
		    System.out.println("Second root is:"+root2);
		}else{
		    System.out.println("Roots are imaginary");
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}

}
