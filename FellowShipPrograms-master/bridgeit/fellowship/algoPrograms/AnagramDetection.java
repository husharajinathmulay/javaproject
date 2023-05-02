package com.bridgeit.fellowship.algoPrograms;

import java.util.Arrays;

import com.bridgeit.fellowship.utility.Utility;
/*
 * purpose:  To Check string is Annagram or not  
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 13-11-2019
 * */

public class AnagramDetection 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the first string");
		String str1 = Utility.inputString();
		System.out.println("Enter the secound string");
		String str2 = Utility.inputString();
		boolean b = Utility.isStringAnagram(str1, str2);
		if (b) 
		{
			System.out.println("String is Anagram");
		} else 
		{
			System.out.println("String is not Anagram");
		}

		// Closing Scanner

		Utility.closeScanner();
	}

	
	

}
