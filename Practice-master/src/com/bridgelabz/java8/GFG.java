package com.bridgelabz.java8;
// Java code for Stream flatMap(Function mapper)
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GFG
{
	// Driver code
	public static void main(String[] args)
	{
		// Creating a list of Prime Numbers
		List<Integer> primeNumbers = Arrays.asList(5, 7, 11,13);
		
		// Creating a list of Odd Numbers
		List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
		
		// Creating a list of Even Numbers
		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

		List<List<Integer>> listOfListofInts =
				Arrays.asList(primeNumbers, oddNumbers, evenNumbers);

		System.out.println("The Structure before flattening is : " +
												listOfListofInts);
		System.out.println("=================================================");
		
		// Using flatMap for transformating and flattening.
		List<Integer> listofInts = listOfListofInts.stream()
				                     .flatMap(list -> list.stream())
									.collect(Collectors.toList());

		System.out.println("The Structure after flattening is : " +
														listofInts);
		
		System.out.println("=================================================");
		
		System.out.println("Second way of flattering ------------");
		
		List<Integer> flatlist=Stream.of(primeNumbers,oddNumbers,evenNumbers).flatMap(list ->list.stream()).collect(Collectors.toList());
		System.out.println("flatlist ...... "+flatlist);
		
		System.out.println("=================================================");
		
		
		List<String> StringList  = Arrays.asList("Abc","pqr","xyz");
		 
		String resultString =StringList.stream().reduce((str1,str2) -> str1+"-"+str2).get();
	   System.out.println(resultString);
	   
	   
	   
	   
	}
	
}
