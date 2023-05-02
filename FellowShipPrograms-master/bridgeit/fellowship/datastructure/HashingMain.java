package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To implement hashing technique. 
* 
* @author Milind Patil
* @version 1.0
* since: 21-11-2019
* */
public class HashingMain
{
	public static void main(String[] args)
	{   
		int arr[]= {10,21,32,33,44,55,66,77,88,99};
		Object obj[]=new Object[11];
		for(int i=0;i<11;i++)
		{
			obj[i]=new LinkedList();
		}
		int slot=0;
		for(int i=0;i<arr.length;i++)
		{
			slot = arr[i]%11;
			LinkedList list = (LinkedList)obj[slot];
			list.insert(arr[i]);
		}	
		for(int i=0;i<obj.length;i++)
		{
			LinkedList list = (LinkedList) obj[i];
			System.out.print("Slot No  "+i+": =>");
			list.show();
			System.out.println();
		}
		System.out.println("Enter data you want search");
		int data=Utility.inputInt();		
		LinkedList list = (LinkedList) obj[data%11];
		if(list.search(data))
		{
			System.out.println("Found at slot no : "+data%11);
			list.delete(data);
			list.show();
		}else {
			System.out.println("not found");
			 LinkedList list1= (LinkedList)obj[data%11];
			 list1.insert(data);
				System.out.print("Slot No  "+data%11+": =>");
			 list1.show();
		}	    	
	}

}