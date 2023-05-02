package com.bridgeit.fellowship.algoPrograms;
import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To check number prime and palindrome or not
* 
* @author Milind Patil
* version 1.0
* @since: 13-11-2019
* */

public class PrimePalindrom {
	

		public static void main(String[] args) 
{

			System.out.println("Enter the first number ");
			int a = Utility.inputInt();
			System.out.println("Enter the second number ");
			int b = Utility.inputInt();
			checkPrime(a,b);
			Utility.closeScanner();;

		}
		
		/**
		 * function to check whether number is prime or not
		 * @param a : first number
		 * @param b : second number
		 **/
		
		public static void checkPrime(int a,int b) 
		{
			for(int i=a;i<=b;i++)
			{
				int count=0;
				for(int j = 2;j<i;j++) 
				{
					if(i%j==0) 
					{
						count++;
						break;
					}
				}
				if(count == 0)
				{
					checkPalindrome(i);
				}
				
				else 
				{
					System.out.println(i+"is not prime number");
				}
			}
			
		}
		
		/**
		 * function to check whether number is palindrome or not
		 * @param i : passing prime number as argument
		 **/
		
		public static void checkPalindrome(int num) 
		{
			int temp = num,rev=0,rem=0;
			while(temp>0) 
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(num==rev) {
				System.out.println(num+" is prime and palindrome number");
			}
		}
	}


