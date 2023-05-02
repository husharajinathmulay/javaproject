package com.bridgeit.fellowship.algoPrograms;
import com.bridgeit.fellowship.utility.Utility;
/*
 * purpose:  sort element using selection sort
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 12-11-2019
 * */
public class SelectionSort
{
	public static void main(String[] args)
	{
	//take n element from user 
	System.out.println("Enter the no of element in array:");
	int n = Utility.inputInt();
	//create array
	int a[] = new int[n];
	int min;
	System.out.println("Enter "+n+" Element in array:");
	for(int i=0;i<n;i++)
	{
		a[i]=Utility.inputInt();
	}
	//selection sort logic
	for(int i=0;i<n;i++)
	{   min=i;
		for(int j=i+1;j<n;j++)
		{
			if(a[j]<a[min])
			{
			 min=j;	
			}
		}
		int t=a[i];
		a[i]=a[min];
		a[min]=t;
		
	}
	System.out.println("sorted array:");
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}      		
	}

}
