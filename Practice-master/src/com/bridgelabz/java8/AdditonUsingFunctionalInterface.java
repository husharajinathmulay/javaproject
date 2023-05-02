package com.bridgelabz.java8;

public class AdditonUsingFunctionalInterface {

	public static void main(String[] args) {

		Addition  addition =  (a , b)-> {
			return a+b; } ;
			
			System.out.println(" addition = "+addition.add(10, 20));
	}

}
