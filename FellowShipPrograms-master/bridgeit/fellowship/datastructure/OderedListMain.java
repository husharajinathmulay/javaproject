package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To read data from file and sort data then store in file. 
* 
* @author Milind Patil
* @version 1.0
* since: 21-11-2019
* */
class OderedListMain 
{
	public static void main(String args[])throws Exception 
 	{  LinkedList list=new LinkedList();
		String str[] = Utility.readFile("Hello.txt");
		 
		int n=str.length;
		System.out.println("Unsorted data=====>>");
		for(String s:str)
		{
			System.out.print(" "+s);
		}
	
		String s[]=Utility.insertionSort(str);
		for(int i=0;i<n;i++)
		{
			list.insert(s[i]);
		}
		System.out.println();
		System.out.println("sorted data=====>>");
		list.show();
		System.out.println("Enter the search String");
        String search=Utility.inputString();
          
        boolean found=list.search(search);
        if(found)
        {
        	list.delete(search);
        System.out.println("found  ");
        }else
        	System.out.println("Not found");

	    Utility.writeToFile("Hello.txt", list);
	}
}