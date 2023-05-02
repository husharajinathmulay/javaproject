package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class GessNumber
{	
		public static void main(String args[]) 
		{Scanner sc=new Scanner(System.in);


			try {
			System.out.println("Enter the number...");
			int n=sc.nextInt();
				int arr[] = new int[n];

			int pow = 1;

		
			for (int i = 0; i < n; i++) {
				pow = pow * 2;
				arr[i] = pow;
				System.out.print(pow + " ");
			}

			System.out.println("\nEnter the number want to be find");
			int x=sc.nextInt();
			int r=binarySearchInt(arr, 0, n - 1, x);
			if (r == -1)
				System.out.println("number not found");
			else
				System.out.println("number found	"+arr[r+1]);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Enter only Integer values");
			}
			sc.close();
		}
		
		public static int binarySearchInt(int arr[], int low, int high, int key) 
	    { 
	        if (high >= low) { 
	            
	        	int mid = low + (high - low) / 2; 
	           
	        	if (arr[mid] == key) 
	                return mid; 
	            
	        	if (arr[mid] > key) 
	                return binarySearchInt(arr, low, mid - 1, key); 
	            
	        	return binarySearchInt(arr, mid + 1, high, key); 
	        } 
	  
	        return -1; 
	    }
}



