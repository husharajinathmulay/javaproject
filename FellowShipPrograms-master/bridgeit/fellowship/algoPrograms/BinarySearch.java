package com.bridgeit.fellowship.algoPrograms;
import java.io.*;
import java.util.Arrays;
import com.bridgeit.fellowship.utility.Utility;
/*
 * purpose:  Binary search using string 
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 12-11-2019
 * */
public class BinarySearch {
	public static void main(String[] args) throws IOException
	{  
		//open file
		String words[]= Utility.readFile("Hello.txt");					
		int mid,first,last;
        int n=words.length;		
		
		for(int i=0;i<words.length;i++)
			
		System.out.println(words[i]);
		
		// sort Array
		
		Arrays.sort(words);
		
		//take search string  from user
		System.out.println("Enter search string");
		String search=Utility.inputString();
		
		//initialize variable
		
		first=0;
		last=n-1;

		boolean flag=false;
		
		while(last>=first)
		{
			//find mid of words array
			
			mid = (first+last)/2;
			
             //compare search string with words array
			
			int x= search.compareTo(words[mid]);
			//check if search contains to word
			if(x==0)
			{
				System.out.println("Search  string found ");
				flag=true;
				break;
			}
			if(x>0)
			{
				first=mid+1;
			}
			else
			{
				last = mid-1;
			}
		}
		if(flag!=true)
		{		
			System.out.println("Search string does not found");
		}
		
		 
	}
	
 
}
