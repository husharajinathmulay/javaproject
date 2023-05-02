package com.bridgeit.fellowship.algoPrograms;
import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To check number is prime or not
* 
* @author Milind Patil
* @version 1.0
* @since 13-11-2019
* */
public class PrimeNumber 
{
      //
		public static void main(String[] args)
		{
			
			System.out.println("Enter the first number ");
			int x = Utility.inputInt();
			System.out.println("Enter the last number ");
			int y = Utility.inputInt();

			//Checking number is prime or not
			
			for(int i=x;i<=y;i++) 
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
					System.out.println(i+"\t");
			}
			
			//Closing Scanner
			
			Utility.closeScanner();
		}
	
}
