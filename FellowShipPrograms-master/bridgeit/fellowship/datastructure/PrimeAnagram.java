package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To gerate prime number upto n given number and chek it is anagram or not . 
* 
* @author Milind Patil
* @version 1.0
* since: 22-11-2019
* */

public class PrimeAnagram 
{
  public static void main(String[] args)
  {   
	  
	  System.out.println("Enter number");
	  int num=Utility.inputInt();
	  int arr[] =Utility.primeSeries(num);
	  int count=0;
	 
	  int i=0;
	  while(arr[i]>0)
	  {
		  count++;
		  i++;
	  }
	 Utility.isAnagram(arr,count);	  	 	  	
 } 
}
