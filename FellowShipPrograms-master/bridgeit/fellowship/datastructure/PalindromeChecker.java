package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Queue;
/*
*
* purpose:  To chek. 
* 
* @author Milind Patil
* @version 1.0
* since: 21-11-2019
* */

public class PalindromeChecker
{
  public static void main(String[] args)
  {
	String str="abc";
	int len=str.length();
	int midlen=(len/2);
	int flag=0;
	for(int i=0;i<len;i++)
	{
		Queue.enqueueRear(str.charAt(i));
	}
	    Queue.printQueue();
	  
	  char s1,s2;
	  int i=0;
	  
	  while(i<midlen)
	  {
	   s1=Queue.dequeueFront();
	   System.out.println(s1);
	  
	   s2=Queue.dequeueRear();
	   System.out.println(s2);
	   if((s1==s2)!=true)
	   {
		   flag=1;
		   break;
	   }	   
	   i++;
	  }
	  
	  if(flag==1)
	  {
		  System.out.println("string is not palindrome");
	  }
	  else
	  {
		   System.out.println("String  palindrome");

	  }
  }
}
