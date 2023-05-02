package com.bridgelabz.java8;

import java.util.Arrays;
import java.util.List;

public class ParallelAndStreamExample 
{
   public static void main(String[] args) {
	
	   List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
	   System.out.println("Output Using Stream ");
	   list.stream().forEach(System.out::println);
	   
	   System.out.println("Output Using Parallel Stream ");
	   list.parallelStream().forEach(System.out::println);
	   
//	Runnable thread1   =()->{
//		   for(int i=0;i<10;i++)
//		   {
//			   System.out.println(i);
//		   }
//	   };
//	   
//	   thread1.run();
			 
}
}
