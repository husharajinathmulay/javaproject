package com.bridgeit.fellowship.algoPrograms;

import com.bridgeit.fellowship.utility.Utility;
/*
* purpose:   To sort strings by using merge sort algorithm
* 
* @author Milind Patil
* @version 1.0
* @since 15-11-2019
* */
public class MergeSort {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the no of  String element in array");
		int n =Utility.inputInt();
		String  str[] = new String[n];
		String s[]=null;
		String key;
		System.out.println("Enter "+n+" Element in array");
		for(int i=0;i<n;i++)
		{
			str[i]=Utility.inputString();
		}
		// call to mergeSort();
		 s=Utility.mergeSort(str,0,str.length-1);	
		System.out.println("Unsorted Array");
		for (String b : s) 
		{
			System.out.print(b+" ");
		}
		
			   
	}
	
  }       
    
	  

