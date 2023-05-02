package com.bridgeit.fellowship.algoPrograms;

import com.bridgeit.fellowship.utility.Utility;

public class GessNumber
{	
		public static void main(String args[]) 
		{

			try {
			System.out.println("Enter the number...");
			int n = Utility.inputInt();
			int arr[] = new int[n];

			int pow = 1;

		
			for (int i = 0; i < n; i++) {
				pow = pow * 2;
				arr[i] = pow;
				System.out.print(pow + " ");
			}

			System.out.println("\nEnter the number want to be find");
			int x = Utility.inputInt();

			int r = Utility.binarySearchInt(arr, 0, n - 1, x);
			if (r == -1)
				System.out.println("number not found");
			else
				System.out.println("number found	"+arr[r+1]);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Enter only Integer values");
			}
		}
}



