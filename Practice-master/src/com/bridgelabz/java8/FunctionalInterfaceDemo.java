package com.bridgelabz.java8;  

@FunctionalInterface   // functional interface classes are  Runnable , Comparable
interface A
{
	void show();
}
@FunctionalInterface
interface Calculator
{
	public  abstract int sum(int a, int b) ;
}
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		
		A boj2 = ()-> System.out.println("test");
		boj2.show();
		
  A obj	=()-> System.out.println("hello") ;    // Example 1
               System.out.println("hello");  
               System.out.println(" "+ 1+1);
			
			
			obj.show();
			                                                                 // Example 2
			 // you can remove int  type , return keyword , and  {} braces
			Calculator calobj	= (int a, int b) ->{ return a+b; }; 
			System.out.println(calobj.sum(2,4));
		                                                                  	// Example 3   
			
			Runnable thread1 =  ()->{
				
				for(int i=0;i<10;i++)
				{  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					System.out.println(" "+i);
				}
			};
			
			
			thread1.run();
		
	}
	
//	public static void main(String[] args) {
//		  A obj	=	new A() {
//
//					@Override
//					public void show() {
//					System.out.println("hellow");	
//					} };
//					
//					
//					obj.show();
//				
//			}
	
}
