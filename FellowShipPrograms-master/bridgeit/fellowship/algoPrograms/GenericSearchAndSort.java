package com.bridgeit.fellowship.algoPrograms;

import java.util.Arrays;

import com.bridgeit.fellowship.utility.Utility;

public class GenericSearchAndSort 
{
	public static void main(String ar[]) 
	{
		System.out.println("Enter n no element in array");
		int n = Utility.inputInt();
		Integer a[] = new Integer[n];
		System.out.println("Enter  " + n + "  Element in Integer array");

		for (int i = 0; i < n; i++) 
		{
			a[i] = Utility.inputInt();
		}

		System.out.println("Enter n no element in String array");

		n = Utility.inputInt();
		String str[] = new String[n];
		System.out.println("Enter    " + n + "   Element in String array");
		for (int i = 0; i < n; i++)
		{
			str[i] = Utility.inputString();
		}

		a = Utility.bubbleSortGeneric(a);

		System.out.println(Arrays.toString(a));

		str = Utility.bubbleSortGeneric(str);

		System.out.println(Arrays.toString(str));

		try {
			System.out.println("Enter integer value for search");
			int key = Utility.inputInt();
			int val = Utility.binarySearchGeneric(a, 0, a.length - 1, key);
			if (val > 0) 
			{
				System.out.println("Found at index " + (val + 1));
			} else 
			{
				System.out.println("Not found");
			}
		} 
		catch (Exception e)
		{

			System.out.println("Enter only integer values");
		}
	}

}
