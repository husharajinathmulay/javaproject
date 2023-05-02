package com.bridgeit.fellowship.utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.bridgeit.fellowship.datastructure.LinkedList;
import com.bridgeit.fellowship.junit.Util;



public class Utility 
{    //create scanner object
	static Scanner sc = new Scanner(System.in);
 /*
  * static function to check for input integer
  * 
  * @return integer of scanner type
  * */
	public static int inputInt() 
	{     
		return sc.nextInt();
	}
	/*
	  * static function to check for input String 
	  * 
	  * @return String of scanner type
	  * */

	public static String inputString()
	{ 
		return sc.nextLine();
	}
	/*
	  * static function to check for input character
	  * 
	  * @return character of scanner type
	  * */

	public static char inputChar()
	{
		return sc.next().charAt(0);		
	}
/*
 * 
 * 
 * function check for inputing float
 * 
 * @return float of scanner type
 * */

	public static Float inputFloat()
	{
		return sc.nextFloat();		
	}
	/*
	 * 
	 * 
	 * static function check for inputing long
	 * 
	 * @return long of scanner type
	 * */

	public static long inputLong() 
	{
		return sc.nextLong();
	}
	/*
	 * 
	 * 
	 * static function check for inputing Boolean
	 * 
	 * @return Boolean of scanner type
	 * */

	public static boolean inputBoolean() 
	{
		return sc.nextBoolean();
	}
	/*static function to close scanner
	 * 
	 * */
	public static void closeScanner()
	{
		sc.close();
	}
	/**
	 * Purpose: function to print 2D Array
	 * @param:Passing string array
	 * */
	public static void print2DArray(String a[][])
	{
		int m=a.length;
		int n=a[0].length;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * Purpose : Function to print 2D Array
	 * @param arr : Passing int array as an argument
	 */
	public static void print2DArray(int a[][])
	{
		int m=a.length;
		int n=a[0].length;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	
	}
	/*
	 * purpose: static function  for inputing double type */

	public static double inputDouble() {
		
		return sc.nextDouble();
	}
	/*
	 * purpose: static function for checking  isLeap year
	 * @param : passing int value
	 * @return: boolean type
	 * */
	public static boolean isLeap(int year)
	{
		if(year % 4 == 0)
		{			
			if(year % 100 == 0) 
			{ 
				if (year % 400 == 0)
			    {
				  return true ;
			    }
				else
				return false;
			}
			else 
				return true;
		}
		else
		return false;
	
		
	
	}
	/*
	 * purpose: static function for generate random number
	 *
	 * @return: integer type
	 * */

	public static int randomNum() 
	{
		Random random=new Random();
		int i=random.nextInt(10);
        if(i!=0)
        {    
      	  return i-1;
        }
        else 
        { 
      	  randomNum();
      	  
        }
     return 0;
   }


	
	
	/*
	 * purpose: static fuction to read from file and store in list
	 *@param: passing file name as string 
	 * @return: String array
	 * */
	
	public static String[] readFile(String filename) throws IOException
	{
		File myfile = new File(filename);
		
	
		String words[]=null;
		//Creating FileReader Object
		
		FileReader fileReader = new FileReader(myfile);
		
		//Creating BufferedReader Object
		
		BufferedReader bufferedreader = new BufferedReader(fileReader);
		String line;
		

		while ((line = bufferedreader.readLine()) != null){
			
			//Appending line by line 
			
		     words=line.split(" ");
		}

		
		//closing the FileReader object
		
		fileReader.close();
		
		//closing the BufferedReader object
		
		bufferedreader.close();
		
		//Returning the String 
		
		return words;
	}
	
	/*
	 * purpose: static fuction write data into the file 
	 *@param: passing file name as string and list of data
	 * @return: void
	 * */
	
	
	
	public static void writeToFile(String filename,LinkedList list) throws IOException{
		FileWriter filewriter = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(filewriter);
	   
		for(int i =0 ; i<=list.size();i++) {
			filewriter.write(list.getElement(i)+" ");
			
		}
		System.out.println("File Writted Successfully");
		bw.close();
		filewriter.close();
	}
	
	public static String[] insertionSort(String s[])
	{    int n= s.length;
		for (int i = 0; i < n; i++) 
		{
			 for(int j=i+1;j<n;j++)
			 {
				 //comparing string
				 if(s[i].compareToIgnoreCase(s[j])>0) 
					{
					s[i].compareToIgnoreCase(s[j]);
				       String t=s[i];
				       s[i]=s[j];
				       s[j]=t;
				       
					}
				
			 }
			 
		}
		return s;
	}

	/*
	 * purpose: static function to sort strings by using merge sort  algorithm
	 *@param: passing string array , first and last index of string length
	 * @return: String array
	 * */
	

		public static String[] mergeSort(String s[],int first,int last)
		{   
			if(first<last)
			{
			int mid=(first+last-1)	/2;
			s=mergeSort(s,first,mid-1);
			s=mergeSort(s,mid+1,last);
		     s=merge(s,first,mid,last);
			}
		    return s;
		    
		}
		
		
		  public static String[]  merge(String arr[], int first, int mid, int last) 
	    { 
	              int n1 = (mid - first) + 1; 
	        int n2 = last - mid; 
	  
	        
	        String left[] = new String [n1]; 
	        String right[] = new String [n2]; 
	        
	      
	        for (int i=0; i<n1; ++i) 
	            left[i] = arr[first + i]; 
	        for (int j=0; j<n2; ++j) 
	            right[j] = arr[(mid + 1)+ j]; 
	  
	  
	        int i = 0, j = 0; 
	  
	              int k = first; 
	             
	          	
    
	        while (i < n1 && j < n2) 
	        { 
	        	//compare left array string of index i with  right array index  j
	            if (left[i].compareToIgnoreCase(right[j])<=0 ) 
	            { 
	                arr[k] = left[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = right[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	      //fetch remaining data of array
	        while (i < n1) 
	        { 
	            arr[k] = left[i]; 
	            i++; 
	            k++; 
	        } 
	  
	      
	        while (j < n2) 
	        { 
	            arr[k] = right[j]; 
	            j++; 
	            k++; 
	        }
	        return arr;
	    } 
		
		  /*
			 * purpose: static function to sort element using bubble sort
			 *@param: passing array 
			 * @return: return sorted array
			 * */
		  
		  public static <T extends Comparable<T>> T[] bubbleSortGeneric(T[] arr)
			 {
				 int i,j;
				T temp;	
					for(i=0;i<arr.length-1;i++)
					{
						for(j=i+1;j<arr.length;j++)
						{
							if(arr[i].compareTo(arr[j])>=0)
							{
								temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
						}
					}
				 return arr;
			 }
		  
		  /*
			 * purpose: static function to search element using binarySearch technique
			 *@param: passing array 
			 * @return: return sorted array
			 * */
		  
		  public static <T extends Comparable<T>> int binarySearchGeneric(T arr[], int low, int high, T key) 
			 { 
			     if (high >= low) { 
			         
			     	int mid = low + (high - low) / 2; 
			        
			     	if (arr[mid].compareTo(key)==0) 
			             return mid; 
			         
			     	if (arr[mid].compareTo(key)>0) 
			             return binarySearchGeneric(arr, low, mid - 1, key); 
			         
			     	return binarySearchGeneric(arr, mid + 1, high, key); 
			     } 

			     return -1; 
			 }
		  
		  /*
			 * purpose: static function to store array of prime numbers into 2D-Array
			 *@param: passing array ,row and colomns of array
			 * @return: return 2D array
			 * */
		  
		  public static int[][] storePrimeNumberInTo2DArray(int primeNumbers[],int row,int col)
			{
				int array[][] = new int[row][col];			
                 int k=0;
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						array[i][j]=primeNumbers[k++];
					}
				}
				
				return array;
			}
		  
		  /*
			 * purpose: static function to generate prime number upto given number
			 *@param: int value
			 * @return: return integer array
			 * */
		   public static int[] primeSeries(int num)
		   {
			   int i =0;
		       int j =0;
		       int k=0;
		      
		       int a[]=new int[num];
		       for (i = 1; i <=num ; i++)         
		       { 		  	  
		    	   int counter=0; 	  
		    	   for(j =i; j>=1; j--)
		    	   {
		    		   if(i%j==0)
		    		   {
		    			   counter = counter + 1;
		    		   }
		    	   }
		    	   if (counter ==2)
		    	   {
		    		  
		    		 a[k]=i;
		    		 
		    		   k++;
		    	   }	
		      }
		       return a;
		   }
		   
		   
		   public static int binarySearchInt(int arr[], int low, int high, int key) 
		    { 
		        if (high >= low) { 
		            
		        	int mid = low + (high - low) / 2; 
		           
		        	if (arr[mid] == key) 
		                return mid; 
		            
		        	if (arr[mid] > key) 
		                return binarySearchInt(arr, low, mid - 1, key); 
		            
		        	return binarySearchInt(arr, mid + 1, high, key); 
		        } 
		  
		        return -1; 
		    }
		   /*
			 * purpose: static function to check number is prime or not
			 *@param: int number
			 * @return: return boolean value
			 * */	   
		   public static boolean isPrime(int num)
		   {
			   if (num <= 1) {  
		           return false;  
		       }  
		       for (int i = 2; i < num; i++) 
		       {  
		           if (num % i == 0)
		           {  
		               return false;  
		           }  
		       }  
		       return true;  
			   
		   }
		   /*
			 * purpose: static function to strings are anagram or not
			 *@param: two strings str1 and str2
			 * @return: return boolean value
			 * */
		
		   
		   public static boolean isStringAnagram(String str1, String str2) 
			{
		            boolean status;
				if (str1.length() != str2.length())
				{
					return false;
				}
				char[] s1 = str1.toLowerCase().toCharArray();
				char[] s2 = str2.toLowerCase().toCharArray();
				Arrays.sort(s1);
				Arrays.sort(s2);
				status=Arrays.equals(s1,s2);
				return status;
				
			}
		   
		   /*
			 * purpose: static function to print  anagram numbers from given array
			 *@param: int one-D array and count of size of array
			 * @return: void
			 * */
		   
		   public static void isAnagram(int a[],int count)
		   {
		 	 String s1,s2;
		 	 boolean status;
		 	  for(int i=0;i<count;i++)
		 	  {	    
		 			  s1= String.valueOf(a[i]);
		 			  for(int j=i;j<count;j++)
		 			  {   if(i!=j)
		 			  	{
		 				  s2=String.valueOf(a[j]);
		 				  status=Utility.isStringAnagram(s1, s2);
//		 				  System.out.println(status);
		 				  if(status==true)
		 					  System.out.println(s1+" "+s2);
		 			  	}
		 			
		 			  }
		 			  
		         }
		 	  
		   }
		   
		   /*
			 * purpose: static function to print value of 
			 *@param: passing array 
			 * @return: return sor
			 * */
		  

		public static<E> void printArray(E [] arr) 
		{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		}

//		public static<E> E[] removeDoublicateInArray(E arr[])
//		{  E temparr[];
//		int i;
//			for( i=1;i<arr.length;i++)
//			{   
//				if(arr[i]!=arr[i-1])
//				{
//					temparr=(E[]) arr[i-1];		
//			
//				}
//			
//			}
//			temparr=(E[])arr[arr.length-1];
//			return temparr;
//			
		
		/*
		 * purpose: static fuction to crate calendar 
		 *@param: passing array  two int valves month and year
		 * @return: return Two-D String array 
		 * */

	public static String[][] createCalendar(int month, int year) 
	{

		String calender[][] = new String[7][7];
		int day = Util.dayOfWeek(1, month, year);
		String dayofWeek[] = { "sun", "mon", "tue", "wed", "thurs", "fri", "sat" };
		int daysofmonth[] = { 30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days = daysofmonth[month];
		int k = 1;
		int flag = 0;
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				if (k <= days) 
				{
					if (i == 0)
					{
						calender[i][j] = dayofWeek[j];
					} else if (day == j) 
					{
						calender[i][j] = String.valueOf(k);
						day++;
						k++;
						flag = 1;
					} else
					{
						calender[i][j] = "";
					}
				}
				else
				{
					calender[i][j]="";
				}

			}
			if (flag == 1) 
			{
				day = 0;
			}

		}
		return calender;
	}
	
	   
	   /*
		 * purpose: static function calculate factorial of given number 
		 *@param: passing int type value
		 * @return: return long type value
		 * */

	
	public static long factorial(int n)
	{  long sum=1;
		for(int i=n;i>0;i--)
		{
			   sum=sum*i;
		}
		return sum;
	}
			

}

			  