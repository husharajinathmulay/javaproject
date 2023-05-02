package com.bridgeit.fellowship.basiccoreprograms;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To find power of two. 
* 
* @author Milind Patil
* @version 1.0
* since: 12-11-2019
* */
public class PowerOfTwo 
{
		
		/**
		  * The main function is written to find power of 2
		  **/
		
		public static void main(String[] args)
		{
			int pow=1;					
			int n=Integer.parseInt(args[0]);
			for(int i=0;i<=n;i++)
			{
				
				//Multiplying power with 2
				if (i==0)
				{
					System.out.println("2^"+i+"\t"+"0");
				
				}
				
				pow=pow*2;
				System.out.println("2^"+i+"\t"+pow);
			}
			
			//Closing Scanner
			
			Utility.closeScanner();

		}
}
