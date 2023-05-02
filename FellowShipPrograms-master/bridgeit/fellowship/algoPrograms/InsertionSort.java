package com.bridgeit.fellowship.algoPrograms;
import  com.bridgeit.fellowship.utility.Utility;
/*
 * purpose:  sort string using insertion sort
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 11-11-2019
 * */
public class InsertionSort
{
	public static void main(String[] args) 
	{	
		System.out.println("Enter the no of  String element in array");
		//take n element in array
		int n =Utility.inputInt();
		// create string array
		String  s[] = new String[n];
		
		System.out.println("Enter "+n+" Element in array");
		for(int i=0;i<n;i++)
		{
			s[i]=Utility.inputString();
		}
		//print array
		System.out.println("Unsorted Array");
		
		for (int i=0;i<n;i++) 
		{
			System.out.print(s[i]+" ");
		}
         //insertion logic
		String str[]=Utility.insertionSort(s);	

		//print sorted array
		System.out.println();
		System.out.println("Sorted array is");		
		for(String t:str)
		{
			System.out.print(t+" ");
		}
	}
}
