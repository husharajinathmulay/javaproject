package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Queue;
import com.bridgeit.fellowship.utility.StackUtility;
import com.bridgeit.fellowship.utility.StackUtility2;
import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To create calender and print it using two stack. 
* 
* @author Milind Patil
* @version 1.0
* since: 25-11-2019
* */
public class QueueInTwoStack 
{
  public static void main(String[] args) 
  {  int i,j;
  	String popeditem;
    
      	
      	System.out.println("Enter month");
      	int month=Utility.inputInt();
  		System.out.println("Enter year");
  		int year=Utility.inputInt();
  		String arr[][]=Utility.createCalendar(month, year);
  
	 
	 for(i=0;i<7;i++)
	 {   for(j=0;j<7;j++)
		 Queue.enqueue(arr[i][j]);	 
	 }
	// Queue.printQueue();
	 
	 for(i=0;i<7;i++)
	 {    for(j=0;j<7;j++)
	 		{
         		 StackUtility.push(Queue.dequeueFront());
	 		}
	 }
	 
	 System.out.println();
	 System.out.println("poped item from stack 1");
	 for(i=0;i<7;i++)
	 {     for(j=0;j<7;j++)
	 		{ 	
		 			popeditem=StackUtility.pop();
		 			StackUtility2.push(popeditem);
	 		}
	 			
	 }
	 System.out.println();
	 System.out.println("poped item from stack 2");
	 
	 for(i=0;i<7;i++)
	 {     for(j=0;j<7;j++)
	 		{	popeditem=StackUtility2.pop();
	       		System.out.print(popeditem+"\t");
	 		}
	        System.out.println();
	 }
  }
}
