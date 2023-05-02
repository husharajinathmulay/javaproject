package com.bridgeit.fellowship.algoPrograms;

import com.bridgeit.fellowship.junit.Util;
import com.bridgeit.fellowship.utility.Utility;

public class StringPermutation
{
	
		public static void main(String[] args) 
		{   System.out.println("Enter string :");
			String str = Utility.inputString(); 
			int n = str.length(); 
			 Util.permutation(str, 0, n - 1); 
		} 

		
	} 




