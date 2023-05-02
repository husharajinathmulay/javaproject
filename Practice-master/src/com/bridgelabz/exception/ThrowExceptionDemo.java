package com.bridgelabz.exception;

public class ThrowExceptionDemo 
{
	public static void main(String[] args)  {
		
		int age=17;
	 
	 	if(age<18)
		{
			throw new MyException("your age is less than 18");
		}
	 	
	  
	}

}
