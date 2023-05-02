package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Queue;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To gerate prime number upto n given number and chek it is anagram or not (using Queue). 
* 
* @author Milind Patil
* @version 1.0
* since: 22-11-2019
* */

public class PrimeAnagramUsingQueue
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
		 isAnagram(arr,count);
		
	  }

	public static void isAnagram(int a[],int count)
	{
	 String s1,s2;
	 int count1=0;
	 boolean status;
	
	  for(int i=0;i<count;i++)
	  {	    
			  s1= String.valueOf(a[i]);
			  for(int j=i;j<count;j++)
			  {   if(i!=j)
			  	{ 
				 	//System.out.println(i+" "+j);
					  s2=String.valueOf(a[j]);
					  status=Utility.isStringAnagram(s1, s2);
					  if(status==true)
					  {   count1=count1+2;
					  	 Queue.enqueue(s1);
					  	 Queue.enqueue(s2);
					  }
					  
			  		
                   
				  }			  
			
			  }
			  
       }
	  
	  Queue.printQueue();
	}
}