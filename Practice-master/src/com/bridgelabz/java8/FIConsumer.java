package com.bridgelabz.java8;

import java.util.Arrays;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FIConsumer
{
  public static void main(String[] args) {
	  
//	1]  Consumer<Integer> consum =new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//			
//				System.out.println(" value ===>"+t);
//			}	
//			
//		};
//			
 // 2]  Consumer<Integer> con = (Integer i) -> System.out.println(i);
	
//3]	  Consumer<Integer> con = (i) -> System.out.println(i);

		List<Integer> arr = Arrays.asList(1,2,3,4,5);
		
		System.out.println("testing "+arr.stream().reduce((a,b)-> a+b).get());
		
		
 // arr.forEach(i -> System.out.println(i));
 // arr.forEach(System.out::println); // method reference 
  
arr.forEach(FIConsumer::disp);   /// create your own method reference

System.out.println(arr.stream().map( i ->i +2).collect(Collectors.toList()).toString());;
  
 System.out.println("reduce --> "+arr.stream().map( i ->i +2).reduce(0,(result,a)-> result + a));
 
System.out.println( arr.stream().map( i ->i +2).reduce(0,Integer::sum));

System.out.println(" using filter -> "+ arr.stream()
                                              .filter(i-> i%2==0)
                                              .reduce((result,element)-> result + element));
  // filter work with predicate functional interface , having test method return boolean value
  } 
  public static void  disp(Integer i){ System.out.println(i);}

}
