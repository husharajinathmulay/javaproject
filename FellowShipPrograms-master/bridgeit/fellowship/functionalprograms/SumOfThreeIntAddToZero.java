package com.bridgeit.fellowship.functionalprograms;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To print three integer number which is sum is zero 0
* 
* @author Milind Patil
* @version 1.0
* @since: 13-11-2019
* */


public class SumOfThreeIntAddToZero
{
	
		
		/**Purpose : To check sum of tree integers are Zero and print it
		 * @author: milind patil
		 * @version:1.0
		 * @since: 13-11-2019
		  **/
		
		public static void main(String[] args)
		{
			System.out.println("Enter the number of elements ");
			int n = Utility.inputInt();
			int[] a= new int[n];
			boolean status = true; 
			
			//Taking array as input
			System.out.println("Enter the elements ");
			for(int i=0;i<n;i++)
			{
					a[i]=Utility.inputInt();
			}
			
			for (int i=0; i<n-2; i++)
			{ 
				for (int j=i+1; j<n-1; j++)
				{ 
					for (int k=j+1; k<n; k++)
					{ 
						if (a[i]+a[j]+a[k] == 0)
						{ 
							System.out.print(a[i]+" "+a[j]+" "+a[k]+","); 
			                 			            
			                status = true; 
			             }
			        } 
			    } 
			} 
			
			//If no such element found then print not exist
			
			if (status == false) 
				System.out.println("not exist "); 
			
			//Closing Scanner Object
			
			Utility.closeScanner();
		}

	

	}



