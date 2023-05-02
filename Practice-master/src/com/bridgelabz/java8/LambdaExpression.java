package com.bridgelabz.java8;

interface B 
{
 public void disp();
}
public class LambdaExpression {
	public static void main(String[] args) {
		
       B a	=()->System.out.print("hello");
       
       a.disp();
	}

}
