package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose:  To find nmber is anagram or not. 
* 
* @author Milind Patil
* @version 1.0
* since: 20-11-2019
* */

public class BinaryTreeMain
{
 
 public static void main(String[] args) 
 {
	 for(int i=0;i<5;i++)
	 {
	 System.out.println("Enter number of nodes in binary tree");
	 int n=Utility.inputInt();
	 long count =countBinaryTree(n);
	 System.out.println("number of ways are=====>>>>"+count);
	 }
 }	 

 public static long countBinaryTree(int n)
 {
 	//(2n)! / ((n + 1)! * n!)
 	long  count=0;
 	
 	count=Utility.factorial(2*n)/((Utility.factorial(n+1)*Utility.factorial(n)));
 	return count;
 }
}

