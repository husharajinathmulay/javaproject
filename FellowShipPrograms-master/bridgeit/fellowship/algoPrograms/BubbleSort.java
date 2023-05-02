package com.bridgeit.fellowship.algoPrograms;

import com.bridgeit.fellowship.utility.Utility;
/*
 * purpose:  sort number of element in array using bubble sort
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 12-11-2019
 * */
public class BubbleSort
{
	public static void main(String[] args)
	{
		System.out.println("Enter the no of element in array");
		int n = Utility.inputInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" Element in array");
		for(int i=0;i<n;i++)
		{
			a[i]=Utility.inputInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}
