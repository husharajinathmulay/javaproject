package com.bridgeit.fellowship.algoPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgeit.fellowship.utility.Utility;

/*
*
* purpose:  Validate to mobile number
* 
* @author Milind Patil
* version 1.0
* @since: 11-2019
* */
public class Regix {
	public static void main(String[] args) {
		String str = "Hello <<name>>, We have your full name as <<full name>> your contact number is 91-xxxxxxxxxx.";
		
		System.out.println("Enter your name ");
		String name = Utility.inputString();
		
		System.out.println("Enter your full name ");
		String fullname = Utility.inputString();

		str = str.replace("<<name>>", name);
		str = str.replace("<<full name>>", fullname);
		System.out.println("Enter your mobile number");	
		String mobileNo = Utility.inputString();

		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(str);
	
		System.out.println("mobile should be 10 digit");
		System.out.println("Enter your mobile number");
		
		mobileNo = Utility.inputString();
		str = str.replace("xxxxxxxxxx", mobileNo);
		System.out.println(str);

	}
}
