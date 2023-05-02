package com.bridglabz.debug;

public class DebugExample {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		int k=0;
	  k =addition(i,j);
	 System.out.println(" "+k);	
	}

	private static int addition(int i, int j) {         
		return i+j;
	}
}
